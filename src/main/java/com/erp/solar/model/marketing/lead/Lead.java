package com.erp.solar.model.marketing.lead;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.erp.solar.model.account.CorporateAccount;
import com.erp.solar.model.account.PrivateAccount;

@Entity
@Table(name="lead_tbl")
public class Lead {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String  account_name;
	private String  addresss;
	private String  contact_fname;
	private String  contact_lname;
	private long lead_id;
	private  String description;
	private Date start_date;
	private Date end_date;
	private String qualification;
	private String status;
	private String status_since;
	private String category;
	private String source;
	private String campaign;
	private String marketing_name;
	private String marketing_email;
	private String sales_name;
	private String sales_email;
	private String remark;
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name="c_account")
	private CorporateAccount corporateAccount;
	
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name="p_account")
	private PrivateAccount privateAccount;
	
	
	public Lead() {
		super();
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

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public String getContact_fname() {
		return contact_fname;
	}

	public void setContact_fname(String contact_fname) {
		this.contact_fname = contact_fname;
	}

	public String getContact_lname() {
		return contact_lname;
	}

	public void setContact_lname(String contact_lname) {
		this.contact_lname = contact_lname;
	}

	public long getLead_id() {
		return lead_id;
	}

	public void setLead_id(long lead_id) {
		this.lead_id = lead_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus_since() {
		return status_since;
	}

	public void setStatus_since(String status_since) {
		this.status_since = status_since;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getMarketing_name() {
		return marketing_name;
	}

	public void setMarketing_name(String marketing_name) {
		this.marketing_name = marketing_name;
	}

	public String getMarketing_email() {
		return marketing_email;
	}

	public void setMarketing_email(String marketing_email) {
		this.marketing_email = marketing_email;
	}

	public String getSales_name() {
		return sales_name;
	}

	public void setSales_name(String sales_name) {
		this.sales_name = sales_name;
	}

	public String getSales_email() {
		return sales_email;
	}

	public void setSales_email(String sales_email) {
		this.sales_email = sales_email;
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


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}

	

	
	
	
}
