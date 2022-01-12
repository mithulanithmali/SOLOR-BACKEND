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
@Table(name = "new_phone_call_tbl")
public class NewPhoneCall {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String call_participant;
	private String subject;
	private Date date_time; 
	private String category;
	private String priority;
	private String status;
	private String direction;
	private String contact;
	private String employee_responsible;
	private String campaign;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "c_account_id")
	private CorporateAccount corporateAccount;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "p_account_id")
	private PrivateAccount privateAccount;
	
	@ManyToOne
	@JoinColumn(name = "new_business_lead")
	@JsonBackReference
	private NewBusinessLead newBusinessLead;
	
	public NewPhoneCall() {
		super();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCall_participant() {
		return call_participant;
	}

	public void setCall_participant(String call_participant) {
		this.call_participant = call_participant;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
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

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
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
		return "NewPhoneCall [id=" + id + ", call_participant=" + call_participant + ", subject=" + subject
				+ ", date_time=" + date_time + ", category=" + category + ", priority=" + priority + ", status="
				+ status + ", direction=" + direction + ", contact=" + contact + ", employee_responsible="
				+ employee_responsible + ", campaign=" + campaign + ", corporateAccount=" + corporateAccount
				+ ", privateAccount=" + privateAccount + ", newBusinessLead=" + newBusinessLead + "]";
	}
	
}
