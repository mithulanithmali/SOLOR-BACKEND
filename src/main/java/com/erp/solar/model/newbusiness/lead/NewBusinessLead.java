package com.erp.solar.model.newbusiness.lead;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.erp.solar.model.account.CorporateAccount;
import com.erp.solar.model.account.PrivateAccount;
import com.erp.solar.model.attachment.File;
import com.erp.solar.model.attachment.Link;
import com.erp.solar.model.lead.activities.ActivityTask;
import com.erp.solar.model.lead.activities.Alert;
import com.erp.solar.model.lead.activities.Appointment;
import com.erp.solar.model.lead.activities.Email;
import com.erp.solar.model.lead.activities.NewPhoneCall;
import com.erp.solar.model.lead.activities.Notification;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "new_business_lead")
public class NewBusinessLead implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String account_name;
	private String account_address;
	private String account_first_name;
	private String account_last_name;
	private String lead_id;
	private String lead_description;
	private Date lead_start_date;
	private Date lead_end_date;
	private String status_qualification;
	private String status_status;
	private String status_since;
	private String classification_category;
	private String classification_source;
	private String classification_campaign;
	private String erm_name;
	private String erm_email;
	private String ers_name;
	private String ers_email;
	private String remark;
	

	@ManyToOne
	@JoinColumn(name="c_account")
	private CorporateAccount corporateAccount;
	
	
	@ManyToOne
	@JoinColumn(name="p_account")
	private PrivateAccount privateAccount;	
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy="newBusinessLead")
	@JsonManagedReference
	private LeadSite leadSite;
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy="newBusinessLead")
	@JsonManagedReference
	private Scoring scoring;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<Appointment> appointment;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<ActivityTask> activityTask;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<Alert> alert;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<Email> email;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<NewPhoneCall> newPhoneCall;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<Notification> notification;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<File> file;
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , mappedBy="newBusinessLead")
	@JsonManagedReference
	private Set<Link> link;
	
	public NewBusinessLead() {

	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAccount_address() {
		return account_address;
	}

	public void setAccount_address(String account_address) {
		this.account_address = account_address;
	}

	public String getAccount_first_name() {
		return account_first_name;
	}

	public void setAccount_first_name(String account_first_name) {
		this.account_first_name = account_first_name;
	}

	public String getAccount_last_name() {
		return account_last_name;
	}

	public void setAccount_last_name(String account_last_name) {
		this.account_last_name = account_last_name;
	}

	public String getLead_id() {
		return lead_id;
	}

	public void setLead_id(String lead_id) {
		this.lead_id = lead_id;
	}

	public String getLead_description() {
		return lead_description;
	}

	public void setLead_description(String lead_description) {
		this.lead_description = lead_description;
	}

	public Date getLead_start_date() {
		return lead_start_date;
	}

	public void setLead_start_date(Date lead_start_date) {
		this.lead_start_date = lead_start_date;
	}

	public Date getLead_end_date() {
		return lead_end_date;
	}

	public void setLead_end_date(Date lead_end_date) {
		this.lead_end_date = lead_end_date;
	}

	public String getStatus_qualification() {
		return status_qualification;
	}

	public void setStatus_qualification(String status_qualification) {
		this.status_qualification = status_qualification;
	}

	public String getStatus_status() {
		return status_status;
	}

	public void setStatus_status(String status_status) {
		this.status_status = status_status;
	}

	public String getStatus_since() {
		return status_since;
	}

	public void setStatus_since(String status_since) {
		this.status_since = status_since;
	}

	public String getClassification_category() {
		return classification_category;
	}

	public void setClassification_category(String classification_category) {
		this.classification_category = classification_category;
	}

	public String getClassification_source() {
		return classification_source;
	}

	public void setClassification_source(String classification_source) {
		this.classification_source = classification_source;
	}

	public String getClassification_campaign() {
		return classification_campaign;
	}

	public void setClassification_campaign(String classification_campaign) {
		this.classification_campaign = classification_campaign;
	}

	public String getErm_name() {
		return erm_name;
	}

	public void setErm_name(String erm_name) {
		this.erm_name = erm_name;
	}

	public String getErm_email() {
		return erm_email;
	}

	public void setErm_email(String erm_email) {
		this.erm_email = erm_email;
	}

	public String getErs_name() {
		return ers_name;
	}

	public void setErs_name(String ers_name) {
		this.ers_name = ers_name;
	}

	public String getErs_email() {
		return ers_email;
	}

	public void setErs_email(String ers_email) {
		this.ers_email = ers_email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
	
	public LeadSite getLeadSite() {
		return leadSite;
	}

	public void setLeadSite(LeadSite leadSite) {
		this.leadSite = leadSite;
	}

	public Scoring getScoring() {
		return scoring;
	}

	public void setScoring(Scoring scoring) {
		this.scoring = scoring;
	}
	
	public Set<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Set<ActivityTask> getActivityTask() {
		return activityTask;
	}

	public void setActivityTask(Set<ActivityTask> activityTask) {
		this.activityTask = activityTask;
	}

	public Set<Alert> getAlert() {
		return alert;
	}

	public void setAlert(Set<Alert> alert) {
		this.alert = alert;
	}

	public Set<Email> getEmail() {
		return email;
	}

	public void setEmail(Set<Email> email) {
		this.email = email;
	}

	public Set<NewPhoneCall> getNewPhoneCall() {
		return newPhoneCall;
	}

	public void setNewPhoneCall(Set<NewPhoneCall> newPhoneCall) {
		this.newPhoneCall = newPhoneCall;
	}

	public Set<Notification> getNotification() {
		return notification;
	}

	public void setNotification(Set<Notification> notification) {
		this.notification = notification;
	}

	public Set<File> getFile() {
		return file;
	}

	public void setFile(Set<File> file) {
		this.file = file;
	}

	public Set<Link> getLink() {
		return link;
	}

	public void setLink(Set<Link> link) {
		this.link = link;
	}	
	

//	@Override
//	public String toString() {
//		return "NewBusinessLead [id=" + id + ", account_name=" + account_name + ", account_address=" + account_address
//				+ ", account_first_name=" + account_first_name + ", account_last_name=" + account_last_name
//				+ ", lead_id=" + lead_id + ", lead_description=" + lead_description + ", lead_start_date="
//				+ lead_start_date + ", lead_end_date=" + lead_end_date + ", status_qualification="
//				+ status_qualification + ", status_status=" + status_status + ", status_since=" + status_since
//				+ ", classification_category=" + classification_category + ", classification_source="
//				+ classification_source + ", classification_campaign=" + classification_campaign + ", erm_name="
//				+ erm_name + ", erm_email=" + erm_email + ", ers_name=" + ers_name + ", ers_email=" + ers_email
//				+ ", remark=" + remark + ", corporateAccount=" + corporateAccount + ", privateAccount=" + privateAccount
//				+ ", leadSite=" + leadSite + ", scoring=" + scoring + ", appointment=" + appointment + ", activityTask="
//				+ activityTask + ", alert=" + alert + ", email=" + email + ", newPhoneCall=" + newPhoneCall
//				+ ", notification=" + notification + "]";
//	}
				
}
