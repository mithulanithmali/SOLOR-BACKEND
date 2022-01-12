package com.erp.solar.model.account;

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
@Table(name="corporate_account")
public class CorporateAccount extends Account {
	
	private String accountName;
	private String additional;
	private String district;
	private Long  contactId;
	private String title;
	private String academicTitle;
	private String firstName;
	private String lastName;
	private String funct;
	private String department;
	private String  industry;
	private String fax_main_com;
	private String website_main_com;
	private String phone_main_contact;
	private String mobile_main_contact;
	private String whatsap_number_main_contact;
	private String email_main_contact;
	private String method_of_main_contact;
	
//	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="corporateAccount")
//	@JsonManagedReference
//	private Set<Lead> lead;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="corporateAccount")
	private Set<NewBusinessLead> newBusinessLead;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="corporateAccount")
	private Set<Appointment> appointment;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="corporateAccount")
	private Set<NewPhoneCall> newPhoneCall;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="corporateAccount")
	private Set<Email> email;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL, mappedBy="corporateAccount")
	private Set<ActivityTask> activityTask;
	
	public CorporateAccount() {
		super();
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getAdditional() {
		return additional;
	}


	public void setAdditional(String additional) {
		this.additional = additional;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public Long getContactId() {
		return contactId;
	}


	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAcademicTitle() {
		return academicTitle;
	}


	public void setAcademicTitle(String academicTitle) {
		this.academicTitle = academicTitle;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFunct() {
		return funct;
	}


	public void setFunct(String funct) {
		this.funct = funct;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getIndustry() {
		return industry;
	}


	public void setIndustry(String industry) {
		this.industry = industry;
	}


	public String getFax_main_com() {
		return fax_main_com;
	}


	public void setFax_main_com(String fax_main_com) {
		this.fax_main_com = fax_main_com;
	}


	public String getWebsite_main_com() {
		return website_main_com;
	}


	public void setWebsite_main_com(String website_main_com) {
		this.website_main_com = website_main_com;
	}


	public String getPhone_main_contact() {
		return phone_main_contact;
	}


	public void setPhone_main_contact(String phone_main_contact) {
		this.phone_main_contact = phone_main_contact;
	}


	public String getMobile_main_contact() {
		return mobile_main_contact;
	}


	public void setMobile_main_contact(String mobile_main_contact) {
		this.mobile_main_contact = mobile_main_contact;
	}


	public String getWhatsap_number_main_contact() {
		return whatsap_number_main_contact;
	}


	public void setWhatsap_number_main_contact(String whatsap_number_main_contact) {
		this.whatsap_number_main_contact = whatsap_number_main_contact;
	}


	public String getEmail_main_contact() {
		return email_main_contact;
	}


	public void setEmail_main_contact(String email_main_contact) {
		this.email_main_contact = email_main_contact;
	}


	public String getMethod_of_main_contact() {
		return method_of_main_contact;
	}


	public void setMethod_of_main_contact(String method_of_main_contact) {
		this.method_of_main_contact = method_of_main_contact;
	}

//	public Set<Lead> getLead() {
//		return lead;
//	}
//
//
//	public void setLead(Set<Lead> lead) {
//		this.lead = lead;
//	}


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
