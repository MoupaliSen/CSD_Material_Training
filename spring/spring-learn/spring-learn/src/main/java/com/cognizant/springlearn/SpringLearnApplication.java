package com.cognizant.springlearn;

import java.util.ArrayList;

import org.slf4j.LoggerFactory;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.bean.Employee;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringLearnApplication {

	
		SpringApplication.run(SpringLearnApplication.class, args);
		private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringLearnApplication.class);
		
		
		 
		
	
public static void displayCountries()
		{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
			List countryList = context.getBean("countryList",List.class);
			LOGGER.debug("Country:{}",countryList);

	}	
		
		
		public  void displayDate() {
			LOGGER.info("START");
			 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
			 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
			 String dateString="31/12/2018";
			 try {
				 Date date=(Date) format.parse(dateString);
				 System.out.println("Parsed date: "+date);
				 String dates=new java.util.Date().toString();
				 LOGGER.debug(dates);
			 }
			 catch(ParseException e) {
				 e.printStackTrace();
			 }
			 LOGGER.info("END");
		
	}
	

	private static void displayCountries() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        ArrayList<Country> countryList = context.getBean("countryList", ArrayList.class);

        LOGGER.debug("List of Countries:");
        for (Country country : countryList) {
            LOGGER.debug(country.toString());
                }
	}
	public static void displayEmployee()
	{
         ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		 
		 Employee emp = context.getBean("employee", Employee.class);
		 System.out.println(emp.toString());

		
	}

    
public static void main(String[] args) {
	displayDate();
    SpringApplication.run(SpringLearnApplication.class, args);
	SpringLearnApplication app = new SpringLearnApplication();
	app.displayDate();
	
	app.displayCountries();
	
	SpringApplication.run(SpringLearnApplication.class, args);
	displayEmployee();
	
	

}


}
