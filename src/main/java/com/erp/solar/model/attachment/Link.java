package com.erp.solar.model.attachment;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.erp.solar.model.newbusiness.lead.NewBusinessLead;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "link_tbl")
public class Link {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String external_address;
	private String document_title;
	private String document_type;
	private String reference;
	private String remark;
	
	@CreationTimestamp()
	@Column(nullable = false, updatable = false)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime created_on;
	
	@ManyToOne
	@JoinColumn(name = "new_business_lead")
	@JsonBackReference
	private NewBusinessLead newBusinessLead;	

	public Link() {

	}

	public Link(int id, String external_address, String document_title, String document_type, String reference,
			String remark, LocalDateTime created_on, NewBusinessLead newBusinessLead) {
		this.id = id;
		this.external_address = external_address;
		this.document_title = document_title;
		this.document_type = document_type;
		this.reference = reference;
		this.remark = remark;
		this.created_on = created_on;
		this.newBusinessLead = newBusinessLead;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExternal_address() {
		return external_address;
	}

	public void setExternal_address(String external_address) {
		this.external_address = external_address;
	}

	public String getDocument_title() {
		return document_title;
	}

	public void setDocument_title(String document_title) {
		this.document_title = document_title;
	}

	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public LocalDateTime getCreated_on() {
		return created_on;
	}

	public void setCreated_on(LocalDateTime created_on) {
		this.created_on = created_on;
	}

	public NewBusinessLead getNewBusinessLead() {
		return newBusinessLead;
	}

	public void setNewBusinessLead(NewBusinessLead newBusinessLead) {
		this.newBusinessLead = newBusinessLead;
	}

	@Override
	public String toString() {
		return "Link [id=" + id + ", external_address=" + external_address + ", document_title=" + document_title
				+ ", document_type=" + document_type + ", reference=" + reference + ", remark=" + remark
				+ ", created_on=" + created_on + ", newBusinessLead=" + newBusinessLead + "]";
	}
	
		
}
