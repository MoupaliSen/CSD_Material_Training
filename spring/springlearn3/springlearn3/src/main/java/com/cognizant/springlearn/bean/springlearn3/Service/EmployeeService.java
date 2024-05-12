package com.cognizant.springlearn.bean.springlearn3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.bean.springlearn3.Dao.EmployeeDao;
@Component
public class EmployeeService {
	private EmployeeDao employeeDao;
	 
    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
        System.out.println("Setter method called for EmployeeDao in EmployeeService");
    }


}