package com.capgemini.doctors.service;

//Service class for management of application data

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.dao.IDoctorAppointmentDao;

public class DoctorAppointmentService implements IDoctorAppointmentService{
	
	IDoctorAppointmentDao dao=new DoctorAppointmentDao();
	public void setDao(DoctorAppointmentDao dao) {
		this.dao = dao;
	}
	//Function for adding Doctor Appointment and generating patient id
	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) {
		return dao.addDoctorAppointmentDetails(doctorAppointment);
	}
	//Function for getting or displaying Appointment Details
	@Override
	public DoctorAppointment getDoctorAppointmentDetails(int appointment_id) {
		return dao.getDoctorAppointmentDetails(appointment_id);
	}

}
