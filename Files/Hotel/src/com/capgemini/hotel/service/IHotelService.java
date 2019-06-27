package com.capgemini.hotel.service;

import com.capgemini.hotel.bean.*;

public interface IHotelService {
	public int addCustomerDetails(CustomerBean bean);
	public RoomBooking getBookingDetails(int cust_id);
}
