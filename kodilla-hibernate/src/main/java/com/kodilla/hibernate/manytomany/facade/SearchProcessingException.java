package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static final String ERR_EMPLOYEE_NOT_FOUND = "No matching entries in Employee.";
    public static final String ERR_COMPANY_NOT_FOUND = "No matching entries in Company.";

    public SearchProcessingException(String message){
        super(message);
    }

}
