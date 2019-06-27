package com.capgemini.hotel.bean;

public class RoomBooking {
	private int room_no;
	private String room_type;
	public RoomBooking() {
		// TODO Auto-generated constructor stub
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public RoomBooking(int room_no, String room_type) {
		super();
		this.room_no = room_no;
		this.room_type = room_type;
	}
	
	
}
