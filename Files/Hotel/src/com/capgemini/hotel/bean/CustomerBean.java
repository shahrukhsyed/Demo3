package com.capgemini.hotel.bean;

public class CustomerBean extends RoomBooking{
	private int cust_id;
	private String cust_name;
	private String cust_email;
	private String cust_addr;
	private long mobile_no;
	
	public CustomerBean() {
		// TODO Auto-generated constructor stub
	}



	public CustomerBean( String cust_name, String cust_email, String cust_addr, long mobile_no,int room_no, String room_type) {
		super(room_no, room_type);
		//this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_email = cust_email;
		this.cust_addr = cust_addr;
		this.mobile_no = mobile_no;
	}



	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getCust_addr() {
		return cust_addr;
	}

	public void setCust_addr(String cust_addr) {
		this.cust_addr = cust_addr;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	
	
}
