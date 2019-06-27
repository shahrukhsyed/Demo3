package com.capgemini.hotel.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.service.HotelService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HotelService service = new HotelService();
		while(true) {
		System.out.println("==============MENU====================");
        System.out.println("1. Book Room");
        System.out.println("2. View Booking Details");
        System.out.println("3. EXIT");
        System.out.println("Enter your choice\n");
        String choice;
		try {
			choice = br.readLine();
			switch (choice) {
			case "1":
				System.out.println("Enter customer name: ");
				String name=br.readLine();
				System.out.println("Enter email: ");
				String email=br.readLine();
				System.out.println("Enter customer address: ");
				String addr=br.readLine();
				System.out.println("Enter mobile no.: ");
				long mb=Long.parseLong(br.readLine());
				System.out.println("Enter Room No. : ");
				int rno=Integer.parseInt(br.readLine());
				System.out.println("Enter Room Type: ");
				String r_type=br.readLine();
				CustomerBean customer=new CustomerBean(name,email,addr,mb,rno,r_type);
				System.out.println("Your Room has been booked, your customer Id is: "+service.addCustomerDetails(customer));				
				break;
			case "2":
					System.out.println("Enter Customer ID: ");
					int cust_id=Integer.parseInt(br.readLine());
					service.getBookingDetails(cust_id);
			case "3":
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
