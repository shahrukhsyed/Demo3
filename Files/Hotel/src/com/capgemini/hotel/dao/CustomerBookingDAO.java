package com.capgemini.hotel.dao;

import java.util.*;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;

public class CustomerBookingDAO implements ICustomerBookingDAO{
	
	
	Map<Integer, CustomerBean> customerDetails=new HashMap<>();
	Map<Integer, String> roomDetails=new HashMap<Integer, String>();
	
	public void addRooms(){
	roomDetails.put(101,"AC_SINGLE");
	roomDetails.put(102,"AC_SINGLE");
	roomDetails.put(103,"AC_DOUBLE");
	roomDetails.put(201,"NONAC_SINGLE");
	roomDetails.put(202,"NONAC_SINGLE");
	roomDetails.put(203,"NONAC_DOUBLE");
}
	
	
	@Override
	public int addCustomerDetails(CustomerBean bean) {
		// TODO Auto-generated method stub
		addRooms();
		Random rand=new Random();
		int cust_id=rand.nextInt(1000);
		customerDetails.put(cust_id, bean);
		return cust_id;
	}

	@Override
	public RoomBooking getBookingDetails(int cust_id) {
		// TODO Auto-generated method stub
		CustomerBean cus=new CustomerBean();
		cus=customerDetails.get(cust_id);
		System.out.println("Name of customer: "+cus.getCust_name());
		System.out.println("Room No: "+cus.getRoom_no());
		System.out.println("Room Type: "+cus.getRoom_type());		
		return null;
	}
		
}
