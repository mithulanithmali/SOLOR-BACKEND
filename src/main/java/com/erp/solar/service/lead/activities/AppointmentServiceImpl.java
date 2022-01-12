package com.erp.solar.service.lead.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.solar.model.lead.activities.Appointment;
import com.erp.solar.repository.lead.activities.AppointmentRepository;
import com.erp.solar.repository.newbusiness.lead.NewBusinessLeadRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public Appointment newAppointment(Appointment appointment) {		
		return appointmentRepository.save(appointment);
	}
	
	

}
