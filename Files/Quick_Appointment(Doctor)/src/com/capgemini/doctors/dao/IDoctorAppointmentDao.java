package com.capgemini.doctors.dao;

import com.capgemini.doctors.bean.DoctorAppointment;

	//interface for DoctorAppointmentDao

		public interface IDoctorAppointmentDao {
			public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment);
			public DoctorAppointment getDoctorAppointmentDetails(int appointment_id);
		}
