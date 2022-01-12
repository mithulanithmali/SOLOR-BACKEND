package com.erp.solar.model.lead.activities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.erp.solar.model.account.CorporateAccount;
import com.erp.solar.model.account.PrivateAccount;
import com.erp.solar.model.newbusiness.lead.NewBusinessLead;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "appointment_tbl")
public class Appointment {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String organizer;
	private String attendee;
	private String subject;
	private String location;
	private Date start_date_time;
	private Date end_date_time;
	private String category;
	private String priority;
	private String status;
	private String contact;
	private String employee_responsible;
	private String notes;
	@ManyToOne
	@JoinColumn(name = "c_account_id")
	private CorporateAccount corporateAccount;
	
	@ManyToOne
	@JoinColumn(name = "p_account_id")
	private PrivateAccount privateAccount;	
	
	@ManyToOne
	@JoinColumn(name = "new_business_lead")
	@JsonBackReference
	private NewBusinessLead newBusinessLead;
		
	public Appointment() {
		super();
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public String getAttendee() {
		return attendee;
	}
	public void setAttendee(String attendee) {
		this.attendee = attendee;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStart_date_time() {
		return start_date_time;
	}
	public void setStart_date_time(Date start_date_time) {
		this.start_date_time = start_date_time;
	}
	public Date getEnd_date_time() {
		return end_date_time;
	}
	public void setEnd_date_time(Date end_date_time) {
		this.end_date_time = end_date_time;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmployee_responsible() {
		return employee_responsible;
	}
	public void setEmployee_responsible(String employee_responsible) {
		this.employee_responsible = employee_responsible;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public CorporateAccount getCorporateAccount() {
		return corporateAccount;
	}
	public void setCorporateAccount(CorporateAccount corporateAccount) {
		this.corporateAccount = corporateAccount;
	}
	public PrivateAccount getPrivateAccount() {
		return privateAccount;
	}
	public void setPrivateAccount(PrivateAccount privateAccount) {
		this.privateAccount = privateAccount;
	}
	public NewBusinessLead getNewBusinessLead() {
		return newBusinessLead;
	}

	public void setNewBusinessLead(NewBusinessLead newBusinessLead) {
		this.newBusinessLead = newBusinessLead;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", organizer=" + organizer + ", attendee=" + attendee + ", subject=" + subject
				+ ", location=" + location + ", start_date_time=" + start_date_time + ", end_date_time=" + end_date_time
				+ ", category=" + category + ", priority=" + priority + ", status=" + status + ", contact=" + contact
				+ ", employee_responsible=" + employee_responsible + ", notes=" + notes + ", corporateAccount="
				+ corporateAccount + ", privateAccount=" + privateAccount + ", newBusinessLead=" + newBusinessLead
				+ "]";
	}
		
}
