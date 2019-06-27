package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
//interface for DoctorAppointmentService
public interface IDoctorAppointmentService {
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment);
	public DoctorAppointment getDoctorAppointmentDetails(int appointment_id);
}
