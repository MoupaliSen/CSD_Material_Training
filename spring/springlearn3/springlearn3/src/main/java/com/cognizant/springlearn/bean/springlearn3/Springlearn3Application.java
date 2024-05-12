package com.cognizant.springlearn.bean.springlearn3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.bean.springlearn3.Controller.EmployeeController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class Springlearn3Application {
	public static void displayEmployee()
	{
         ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		 Employee emp = context.getBean("employeeSkill",Employee.class);
		 System.out.println(emp.toString());
 
		
	}
	 public static void displayEmployeeControllerAnnotation(ApplicationContext applicationContext) {
	        EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
	        System.out.println("Loaded EmployeeController bean: " + employeeController);
	    }
	 

	
	public static void main(String[] args) {
		SpringApplication.run(Springlearn3Application.class, args);
		
		displayEmployee();
		
		
		
		
	}

}
