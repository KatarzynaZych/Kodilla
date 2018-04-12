package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;


    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            employeeDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void testRetrieveWithThreeLitters(){
        //Given
        Employee johnKorzonek = new Employee("John", "Korzonek");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee kateKorzonek = new Employee("Kate", "Korzonek");

        Company machineCompany = new Company("Machine Company");
        Company mastersCompany = new Company("Masters Company");
        Company bankCompany = new Company("Bank Company");

        machineCompany.getEmployees().add(johnKorzonek);
        mastersCompany.getEmployees().add(stephanieClarckson);
        mastersCompany.getEmployees().add(lindaKovalsky);
        bankCompany.getEmployees().add(kateKorzonek);

        johnKorzonek.getCompanies().add(machineCompany);
        stephanieClarckson.getCompanies().add(mastersCompany);
        lindaKovalsky.getCompanies().add(mastersCompany);
        kateKorzonek.getCompanies().add(bankCompany);

        companyDao.save(machineCompany);
        int machineId = machineCompany.getId();
        companyDao.save(mastersCompany);
        int mastersId = mastersCompany.getId();
        companyDao.save(bankCompany);
        int bankId= bankCompany.getId();

        //When
        List<Company> resultCompanyName = companyDao.retrieveWithThreeLetters("Ban");

        //Then
        Assert.assertEquals(1, resultCompanyName.size());

        //CleanUp
        try {
            companyDao.delete(machineId);
            companyDao.delete(mastersId);
            companyDao.delete(bankId);


        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveLastNames(){
        //Given
        Employee johnKorzonek = new Employee("John", "Korzonek");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee kateKorzonek = new Employee("Kate", "Korzonek");

        Company machineCompany = new Company("Machine Company");
        Company mastersCompany = new Company("Masters Company");
        Company bankCompany = new Company("Bank Company");

        machineCompany.getEmployees().add(johnKorzonek);
        mastersCompany.getEmployees().add(stephanieClarckson);
        mastersCompany.getEmployees().add(lindaKovalsky);
        bankCompany.getEmployees().add(kateKorzonek);


        johnKorzonek.getCompanies().add(machineCompany);
        stephanieClarckson.getCompanies().add(mastersCompany);
        lindaKovalsky.getCompanies().add(mastersCompany);
        kateKorzonek.getCompanies().add(bankCompany);

        companyDao.save(machineCompany);
        int machineId = machineCompany.getId();
        companyDao.save(mastersCompany);
        int mastersId = mastersCompany.getId();
        companyDao.save(bankCompany);
        int bankId= bankCompany.getId();

        //When
        List<Employee> resultLastname = employeeDao.retrieveLastname("Korzonek");

        //Then
        Assert.assertEquals(2, resultLastname.size());

        //CleanUp
        try {
            companyDao.delete(machineId);
            companyDao.delete(mastersId);
            companyDao.delete(bankId);
        } catch (Exception e) {
            //do nothing
        }
    }
}