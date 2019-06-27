package com.capgemini.doctors.service;

public interface Validator {
	
	//Validation Patterns for Properties of Doctor-Appointment
	
	public String patient_name_pattern="[a-zA-Z\\s]*";
	public String mobilepattern="[1-9]{1}[0-9]{9}";
	public String emailpattern="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	public String agepattern="[0-9][0-9]*[0-9]*";
	public String genderpattern="[a-zA-Z]*";
	public String problempattern="[a-zA-Z]*";
	
	//Function for Validating Data
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
		
	}
}
