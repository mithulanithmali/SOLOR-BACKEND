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
@Table(name = "activity_task_tbl")
public class ActivityTask {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String processor;
	private String subject;
	private Date start_date;
	private Date due_date;
	private String completion;
	private String category;
	private String priority;
	private String status;
	private String contact;
	private String employee_responsible;
	private String notes;
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
	
	public ActivityTask() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public String getCompletion() {
		return completion;
	}

	public void setCompletion(String completion) {
		this.completion = completion;
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
		return "ActivityTask [id=" + id + ", processor=" + processor + ", subject=" + subject + ", start_date="
				+ start_date + ", due_date=" + due_date + ", completion=" + completion + ", category=" + category
				+ ", priority=" + priority + ", status=" + status + ", contact=" + contact + ", employee_responsible="
				+ employee_responsible + ", notes=" + notes + ", corporateAccount=" + corporateAccount
				+ ", privateAccount=" + privateAccount + ", newBusinessLead=" + newBusinessLead + "]";
	}
		
}
