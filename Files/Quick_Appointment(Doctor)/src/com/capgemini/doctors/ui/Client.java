package com.capgemini.doctors.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.service.DoctorAppointmentService;
import com.capgemini.doctors.service.Validator;

public class Client {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DoctorAppointmentService service=new DoctorAppointmentService();
		//Menu for selecting desired option
		while(true) {
		System.out.println("==============MENU====================");
        System.out.println("1. Book Doctor Appointment");
        System.out.println("2. View Doctor Appointment");
        System.out.println("3. EXIT");
        System.out.println("Enter your choice\n");
        String choice;
		try {
			choice = br.readLine();
			switch (choice) {
			case "1":
				String name="";
				long mob=0l;
				String email="";
				int age=0;
				String gen="";
				String prob="";
				//Accepting and Validating input for patient name
				System.out.println("Enter patient name: ");
				while(true)
				{
					name=br.readLine();
					boolean check=Validator.validatedata(name,Validator.patient_name_pattern);
					if(check==true)
					{
						break;
					}
					else
					{
						
						System.out.println("Re-Enter name");
					}
			    }		
				

				//Accepting and Validating input for Mobile number
				System.out.println("Enter mobile no.: ");
				while(true)
				{
				String mobileno=br.readLine();
				boolean check=Validator.validatedata(mobileno,Validator.mobilepattern);
					if(check==true)
					{
						try
						{
							mob=Long.parseLong(mobileno);
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Mobile Number must be numeric, Re-Enter");
						}
					}
					else
					{
						System.out.println("Re-Enter Mobile Number (10 digits)");
					}
				}
				
				

				//Accepting and Validating input for Email
				System.out.println("Enter email: ");
				while(true)
				{
					email=br.readLine();
					boolean check=Validator.validatedata(email,Validator.emailpattern);
					if(check==true)
					{
						break;
					}
					else
					{
						
						System.out.println("Invalid email-id entered, Re-Enter in correct format");
					}
			    }
				

				//Accepting and Validating input for patient age
				System.out.println("Enter Age : ");
				while(true)
				{
				String ageString=br.readLine();
				boolean check=Validator.validatedata(ageString,Validator.agepattern);
					if(check==true)
					{
						try
						{
							age=Integer.parseInt(ageString);
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Age must be numeric, Re-Enter");
						}
					}
					else
					{
						System.out.println("Re-Enter Age");
					}
				}
				

				//Accepting and Validating input for patient gender
				System.out.println("Enter Gender: ");
				while(true)
				{
					gen=br.readLine();
					boolean check=Validator.validatedata(gen,Validator.genderpattern);
					if(check==true)
					{
						break;
					}
					else
					{
						
						System.out.println("Re-Enter Gender[Male,Female,Others]");
					}
			    }

				//Accepting and Validating input for patient problem
				System.out.println("Enter Problem: ");
				while(true)
				{
					prob=br.readLine();
					boolean check=Validator.validatedata(prob,Validator.problempattern);
					if(check==true)
					{
						break;
					}
					else
					{
						
						System.out.println("Re-Enter Problem");
					}
			    }
					
				//Creating object from user inputs
				DoctorAppointment doctorAppointment=new DoctorAppointment(name,mob,email,age,gen,prob);
				System.out.println("Your Doctor Appointment has been successfully registered,"+"\n"+" your appointment Id is: "+service.addDoctorAppointmentDetails(doctorAppointment));				
				break;
			case "2":

				//Accepting and Validating input for patient appointment-id
					System.out.println("Enter Appointment ID: ");
					int appointmentId;
					while(true)
					{
					String appointment_id=br.readLine();
					boolean check=Validator.validatedata(appointment_id,Validator.agepattern);
						if(check==true)
						{
							try
							{
								appointmentId=Integer.parseInt(appointment_id);
								break;
							}
							catch(NumberFormatException e)
							{
								System.out.println("Appointment-Id must be numeric, Re-Enter");
							}
						}
						else
						{
							System.out.println("Re-Enter Appointment-Id [Must be Numeric]");
						}
					}
					service.getDoctorAppointmentDetails(appointmentId);
					break;
			case "3":
				//Exiting the application
					System.out.println("Exited Successfully");
				   System.exit(0);
                   break;
            default:
            	  System.out.println("Invalid choice");
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        
		}
	}

}
