package com.erp.solar.model.account;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.erp.solar.common.Account;
import com.erp.solar.model.lead.activities.ActivityTask;
import com.erp.solar.model.lead.activities.Appointment;
import com.erp.solar.model.lead.activities.Email;
import com.erp.solar.model.lead.activities.NewPhoneCall;
import com.erp.solar.model.marketing.lead.Lead;
import com.erp.solar.model.newbusiness.lead.NewBusinessLead;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="private_account")
public class PrivateAccount  extends Account{

	private String account_title;
	private String first_name;
	private String last_name;
	private String profession;
	private String gender;
	private Date dateOfBirth;
	private String mobile;
	private String whatsapNumber_main_com;
	private String method_of_main_com;
	
//	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="privateAccount")
//	@JsonManagedReference
//	private Set<Lead> lead;
//	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="privateAccount")
	private Set<NewBusinessLead> newBusinessLead;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="privateAccount")
	private Set<Appointment> appointment;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="privateAccount")
	private Set<NewPhoneCall> newPhoneCall;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="privateAccount")
	private Set<Email> email;	
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="privateAccount")
	private Set<ActivityTask> activityTask;
	
	public PrivateAccount() {
		super();
	}

	public String getAccount_title() {
		return account_title;
	}

	public void setAccount_title(String account_title) {
		this.account_title = account_title;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWhatsapNumber_main_com() {
		return whatsapNumber_main_com;
	}

	public void setWhatsapNumber_main_com(String whatsapNumber_main_com) {
		this.whatsapNumber_main_com = whatsapNumber_main_com;
	}

	public String getMethod_of_main_com() {
		return method_of_main_com;
	}

	public void setMethod_of_main_com(String method_of_main_com) {
		this.method_of_main_com = method_of_main_com;
	}
	
//	public Set<Lead> getLead() {
//		return lead;
//	}
//
//	public void setLead(Set<Lead> lead) {
//		this.lead = lead;
//	}
//
	public Set<NewBusinessLead> getNewBusinessLead() {
		return newBusinessLead;
	}

	public void setNewBusinessLead(Set<NewBusinessLead> newBusinessLead) {
		this.newBusinessLead = newBusinessLead;
	}

	public Set<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Set<NewPhoneCall> getNewPhoneCall() {
		return newPhoneCall;
	}

	public void setNewPhoneCall(Set<NewPhoneCall> newPhoneCall) {
		this.newPhoneCall = newPhoneCall;
	}

	public Set<Email> getEmail() {
		return email;
	}

	public void setEmail(Set<Email> email) {
		this.email = email;
	}

	public Set<ActivityTask> getActivityTask() {
		return activityTask;
	}

	public void setActivityTask(Set<ActivityTask> activityTask) {
		this.activityTask = activityTask;
	}
			
}
