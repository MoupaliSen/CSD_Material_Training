package com.cognizant.springlearn.bean.springlearn3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cognizant.springlearn.bean.springlearn3.Service.EmployeeService;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;
    
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
        System.out.println("Setter method called for EmployeeService in EmployeeController");
    }


}
