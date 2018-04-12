package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private final static Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public void addEmployeeToCompany(Company company, Employee employee) {
        company.getEmployees().add(employee);
        employee.getCompanies().add(company);
        companyDao.save(company);
        employeeDao.save(employee);
    }

    public void deleteAll() {
        companyDao.deleteAll();
    }

    public List<Company> searchCompany(String partName) throws SearchProcessingException {
        LOGGER.info("Searching company in progress ...");
        List<Company> companies = companyDao.retrieveWithPart(partName);

        if (companies.isEmpty()){
            LOGGER.error("No matching entries for search criteria.");
            throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
        }else {
            LOGGER.info("Matching entries: ");
        }

        return companies;
    }

    public List<Employee> searchEmployee(String name) throws SearchProcessingException {
        LOGGER.info("Searching company in progress ...");
        List<Employee> employees = employeeDao.retrieveName(name);

        if (employees.isEmpty()){
            LOGGER.error("No matching entries for search criteria.");
            throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        }else {
            LOGGER.info("Matching entries: ");
        }

        return employees;
    }



}
