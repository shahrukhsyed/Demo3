package com.capgemini.doctors.bean;

//Bean Package for Quick_Appointment_Service containing Template for Doctor Appointment


public class DoctorAppointment {
	//Attributes/Properties of Doctor-Appointment
	private int appointmentId;
	private int age;
	private long phone_number;
	private String patientName;
	private String appointmentStatus="Disapproved";
	private String problemName;
	private String doctorName;
	private String gender;
	private String email;
	
	//Default Constructor
	public DoctorAppointment() {
	}
	
	//Parameterized Constructor 
	public DoctorAppointment(String patientName,long phone_number,String email,int age,String gender,String problemName) {
		super();
		this.age = age;
		this.phone_number = phone_number;
		this.patientName = patientName;
		this.problemName = problemName;
		this.gender = gender;
		this.email = email;
	}
	
	//Getter and Setter methods
	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public String getProblemName() {
		return problemName;
	}

	public void setProblemName(String problemName) {
		this.problemName = problemName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DoctorAppointment [appointmentId=" + appointmentId + ", age=" + age + ", phone_number=" + phone_number
				+ ", patientName=" + patientName + ", appointmentStatus=" + appointmentStatus + ", problemName="
				+ problemName + ", gender=" + gender + ", email=" + email + "]";
	}

	
	
	
	
}
