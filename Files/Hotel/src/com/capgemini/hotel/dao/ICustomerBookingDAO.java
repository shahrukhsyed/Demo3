package com.capgemini.hotel.dao;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;

public interface ICustomerBookingDAO {
	public int addCustomerDetails(CustomerBean bean);
	public RoomBooking getBookingDetails(int cust_id);
}
