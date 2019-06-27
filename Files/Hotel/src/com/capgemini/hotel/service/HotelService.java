package com.capgemini.hotel.service;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;
import com.capgemini.hotel.dao.CustomerBookingDAO;

public class HotelService implements IHotelService{
	CustomerBookingDAO dao=new CustomerBookingDAO();
	@Override
	public int addCustomerDetails(CustomerBean bean) {
		// TODO Auto-generated method stub
		
		
		return dao.addCustomerDetails(bean);
	}

	@Override
	public RoomBooking getBookingDetails(int cust_id) {
		// TODO Auto-generated method stub
		
		return dao.getBookingDetails(cust_id);
	}

}
