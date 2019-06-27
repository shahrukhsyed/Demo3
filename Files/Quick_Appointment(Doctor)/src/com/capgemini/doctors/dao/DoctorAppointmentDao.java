package com.capgemini.doctors.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.doctors.bean.DoctorAppointment;


public class DoctorAppointmentDao implements IDoctorAppointmentDao {
	
	
	
	//Map for storing,accessing and retrieving Patient Details
	Map<Integer, DoctorAppointment> patients=new HashMap<>();
	//Map for storing,accessing and retrieving Doctor Details 
	Map<String, String> doctor=new HashMap<String, String>();

	//Function for adding Doctor Appointment and generating patient id
	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) {
		 doctor.put("Heart","Dr. Brijesh Kumar");
		 doctor.put("Bone","Dr. Renuka Kher");
		 doctor.put("Diabetes","Dr. Heena Khan");
		 doctor.put("Gynecology","Dr. Sharda Singh");
		 doctor.put("ENT","Dr. Paras mal");
		 doctor.put("Dermatology","Dr. Kanika Kapoor");
		 
		int pid=(int)(Math.random()*1000);
		doctorAppointment.setAppointmentId(pid);
		patients.put(pid, doctorAppointment);
		return pid;
	}
	
	//Function for getting or displaying Appointment Details
	@Override
	public DoctorAppointment getDoctorAppointmentDetails(int appointment_id) {
		
		DoctorAppointment doctorAppointment=new DoctorAppointment();
		doctorAppointment=patients.get(appointment_id);
		
		if(patients.containsKey(appointment_id)) {

		String problem=doctorAppointment.getProblemName();
		
		if(doctor.containsKey(problem)) {
			doctorAppointment.setAppointmentStatus("Approved");
		}
		System.out.println("Patient Name: "+doctorAppointment.getPatientName());
		System.out.println("Appointment Status: "+doctorAppointment.getAppointmentStatus());
		System.out.println("Doctor Name: "+doctor.get(problem));
		if(doctorAppointment.getAppointmentStatus().equals("Approved"))
		System.out.println("Appointment Date and time, along with doctor's phone number will be shared shortly with you.");
		
		}
		else {
			System.out.println("Appointment-Id not found. \nPlease enter correct Appointment-id");
		}
		return doctorAppointment;
	}

}
