package implementation;

import java.io.IOException;
import java.util.Scanner;

import driverSetup.Driver;

public class Implementation extends Driver{
	private static Scanner sc;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		 sc = new Scanner(System.in);
		 
         
		Implementation imp = new Implementation();
		HomePage hp = new HomePage();
		CompletedProject cp = new CompletedProject();
		Enquiry en = new Enquiry();
		
	    	while(true) {
	    	System.out.println("Choose the browser :");
	    	System.out.println("1. Chrome ");
			System.out.println("2. Edge ");
			System.out.println("3. Exit");
			
	     int choice = sc.nextInt();
	     imp.driverSetup(choice);
	     hp.handlePopups();
	     hp.navigateToCompletedProjects();
		 cp.availableProject();
		 en.enquiryNow();
		
	}


	}
}
