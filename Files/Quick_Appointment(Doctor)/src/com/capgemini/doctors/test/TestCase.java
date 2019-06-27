package com.capgemini.doctors.test;

import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.service.DoctorAppointmentService;

class TestCase {
	DoctorAppointment doctorAppointment;
	DoctorAppointmentDao mockDao;
	DoctorAppointmentService service;

	@BeforeEach
	public void setup() {
		service = new DoctorAppointmentService();
		mockDao = EasyMock.createMock(DoctorAppointmentDao.class);
		service.setDao(mockDao);
	}
	@Test
	public void testLogin(){
		DoctorAppointment doctorAppointment=new DoctorAppointment("Shahrukh",1234567890L,"shah@gmail.com",21,"Male","Heart");	
		/* expect tells your mock object to expect the method */
		EasyMock.expect
		(mockDao.addDoctorAppointmentDetails(doctorAppointment))
		.andReturn(doctorAppointment.getAppointmentId()); //tells mock object what to return after this method is called
		
		/* replay() tells EasyMock : "we are done declaring 
		 * our expectations. Its time to run what we told you" */
		EasyMock.replay(mockDao);
		
		/* assertTrue() does two things:
		 * 1. executes the code to be tested
		 * 2. Tests that the result is true
		 */
		assertNotNull(service.addDoctorAppointmentDetails(doctorAppointment));
		
		/* verify() : tells EasyMock to validate that 
		 * all expected method calls were executed and in the correct order */
		EasyMock.verify(mockDao);
	}
	
	@Test
	void test2() {
		doctorAppointment=new DoctorAppointment("Shahrukh",1234567890,"shah@gmail.com",21,"Male","Heart");
		assertNotNull(doctorAppointment);
	}
}
