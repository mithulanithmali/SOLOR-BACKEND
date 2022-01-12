package com.erp.solar.model.newbusiness.lead;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "lead_site")
public class LeadSite implements Serializable {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String category;
	private String area_office;
	private String existing_connection;
	private String expected_upgrade;
	private String existing_utility_account;
	private String expected_module_capacity;
	private Integer house_number;
	private String street;
	private String city;
	private String district;
	private Integer postal_code;
	private String notes;	

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "new_business_lead")
	@JsonBackReference()
	private NewBusinessLead newBusinessLead;
	
	public LeadSite() {

	}

	public LeadSite(int id, String category, String area_office, String existing_connection, String expected_upgrade,
			String existing_utility_account, String expected_module_capacity, Integer house_number, String street,
			String city, String district, Integer postal_code, String notes) {
		this.id = id;
		this.category = category;
		this.area_office = area_office;
		this.existing_connection = existing_connection;
		this.expected_upgrade = expected_upgrade;
		this.existing_utility_account = existing_utility_account;
		this.expected_module_capacity = expected_module_capacity;
		this.house_number = house_number;
		this.street = street;
		this.city = city;
		this.district = district;
		this.postal_code = postal_code;
		this.notes = notes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getArea_office() {
		return area_office;
	}

	public void setArea_office(String area_office) {
		this.area_office = area_office;
	}

	public String getExisting_connection() {
		return existing_connection;
	}

	public void setExisting_connection(String existing_connection) {
		this.existing_connection = existing_connection;
	}

	public String getExpected_upgrade() {
		return expected_upgrade;
	}

	public void setExpected_upgrade(String expected_upgrade) {
		this.expected_upgrade = expected_upgrade;
	}

	public String getExisting_utility_account() {
		return existing_utility_account;
	}

	public void setExisting_utility_account(String existing_utility_account) {
		this.existing_utility_account = existing_utility_account;
	}

	public String getExpected_module_capacity() {
		return expected_module_capacity;
	}

	public void setExpected_module_capacity(String expected_module_capacity) {
		this.expected_module_capacity = expected_module_capacity;
	}

	public Integer getHouse_number() {
		return house_number;
	}

	public void setHouse_number(Integer house_number) {
		this.house_number = house_number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public Integer getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(Integer postal_code) {
		this.postal_code = postal_code;
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
		return "LeadSite [id=" + id + ", category=" + category + ", area_office=" + area_office
				+ ", existing_connection=" + existing_connection + ", expected_upgrade=" + expected_upgrade
				+ ", existing_utility_account=" + existing_utility_account + ", expected_module_capacity="
				+ expected_module_capacity + ", house_number=" + house_number + ", street=" + street + ", city=" + city
				+ ", district=" + district + ", postal_code=" + postal_code + ", notes=" + notes + ", newBusinessLead="
				+ newBusinessLead + "]";
	}	

}
