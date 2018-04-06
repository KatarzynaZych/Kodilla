package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.Facade;
import com.kodilla.hibernate.manytomany.facade.SearchProcessingException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTest {

    @Autowired
    private Facade facade;


    @Test
    public void testFindCompany() {
        //Given

        facade.addEmployeeToCompany(new Company("Machine Company"), new Employee("John", "Smith"));
        facade.addEmployeeToCompany(new Company("Masters Company"), new Employee("Stephanie", "Clarckson"));
        facade.addEmployeeToCompany(new Company("Bank Company"), new Employee("Linda", "Kovalsky"));
        //When
        List<Company> list = new ArrayList<>();
        try {
            list = facade.searchCompany("any");
        } catch (SearchProcessingException e) {

        }
        facade.deleteAll();
        //Then
        Assert.assertEquals(3, list.size());

        //CleanUp
        facade.deleteAll();
    }

    @Test
    public void testFindEmployee() {
        //Given
        facade.deleteAll();

        facade.addEmployeeToCompany(new Company("Machine Company"), new Employee("Thomas", "Smith"));
        facade.addEmployeeToCompany(new Company("Masters Company"), new Employee("Joanna", "Clarckson"));
        facade.addEmployeeToCompany(new Company("Bank Company"), new Employee("Maria", "Kovalsky"));

        //When
        List<Employee> list = new ArrayList<>();
        try {
            list = facade.searchEmployee("nna");
        } catch (SearchProcessingException e) {
        }

        //Then
        //Assert.assertNotNull(list);
       Assert.assertEquals(1, list.size());

        //CleanUp
        facade.deleteAll();
    }
}
