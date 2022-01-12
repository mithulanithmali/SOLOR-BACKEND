package com.erp.solar.model.lead.activities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.erp.solar.model.newbusiness.lead.NewBusinessLead;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "notification_tbl")
public class Notification {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="value_To") 
	private String to;
	private Date expiry_date;
	@Column(name="value_Subject") 
	private String subject;
	private String priority;
	private String notes;
	
	@ManyToOne
	@JoinColumn(name = "new_business_lead")
	@JsonBackReference
	private NewBusinessLead newBusinessLead;
	
	public Notification() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public NewBusinessLead getNewBusinessLead() {
		return newBusinessLead;
	}

	public void setNewBusinessLead(NewBusinessLead newBusinessLead) {
		this.newBusinessLead = newBusinessLead;
	}

	@Override
	public String toString() {
		return "Notification [id=" + id + ", to=" + to + ", expiry_date=" + expiry_date + ", subject=" + subject
				+ ", priority=" + priority + ", notes=" + notes + ", newBusinessLead=" + newBusinessLead + "]";
	}
	
}
