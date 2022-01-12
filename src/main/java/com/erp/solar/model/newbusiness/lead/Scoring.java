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
@Table(name = "scoring_tbl")
public class Scoring implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double province;
	private double installation_area;
	private double cash_basis;
	private double ceb_connection;
	private double solar_capacity;
	private double competitive_quotes;
	private double inverter_type;
	private double price_range;
	private double repeat_customer;
	private double correspondence_records;
	private double site_visit;
	private double proposal_sent;
	private double proposal_negotiation_level;
	private double draft_agreement;
	private double confirmation;
	private double pre_approval;
	private double payment;
	private double first_milestone_payment;		

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "new_business_lead")
	@JsonBackReference()
	private NewBusinessLead newBusinessLead;

	public Scoring() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getProvince() {
		return province;
	}

	public void setProvince(double province) {
		this.province = province;
	}

	public double getInstallation_area() {
		return installation_area;
	}

	public void setInstallation_area(double installation_area) {
		this.installation_area = installation_area;
	}

	public double getCash_basis() {
		return cash_basis;
	}

	public void setCash_basis(double cash_basis) {
		this.cash_basis = cash_basis;
	}

	public double getCeb_connection() {
		return ceb_connection;
	}

	public void setCeb_connection(double ceb_connection) {
		this.ceb_connection = ceb_connection;
	}

	public double getSolar_capacity() {
		return solar_capacity;
	}

	public void setSolar_capacity(double solar_capacity) {
		this.solar_capacity = solar_capacity;
	}

	public double getCompetitive_quotes() {
		return competitive_quotes;
	}

	public void setCompetitive_quotes(double competitive_quotes) {
		this.competitive_quotes = competitive_quotes;
	}

	public double getInverter_type() {
		return inverter_type;
	}

	public void setInverter_type(double inverter_type) {
		this.inverter_type = inverter_type;
	}

	public double getPrice_range() {
		return price_range;
	}

	public void setPrice_range(double price_range) {
		this.price_range = price_range;
	}

	public double getRepeat_customer() {
		return repeat_customer;
	}

	public void setRepeat_customer(double repeat_customer) {
		this.repeat_customer = repeat_customer;
	}

	public double getCorrespondence_records() {
		return correspondence_records;
	}

	public void setCorrespondence_records(double correspondence_records) {
		this.correspondence_records = correspondence_records;
	}

	public double getSite_visit() {
		return site_visit;
	}

	public void setSite_visit(double site_visit) {
		this.site_visit = site_visit;
	}

	public double getProposal_sent() {
		return proposal_sent;
	}

	public void setProposal_sent(double proposal_sent) {
		this.proposal_sent = proposal_sent;
	}

	public double getProposal_negotiation_level() {
		return proposal_negotiation_level;
	}

	public void setProposal_negotiation_level(double proposal_negotiation_level) {
		this.proposal_negotiation_level = proposal_negotiation_level;
	}

	public double getDraft_agreement() {
		return draft_agreement;
	}

	public void setDraft_agreement(double draft_agreement) {
		this.draft_agreement = draft_agreement;
	}

	public double getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(double confirmation) {
		this.confirmation = confirmation;
	}

	public double getPre_approval() {
		return pre_approval;
	}

	public void setPre_approval(double pre_approval) {
		this.pre_approval = pre_approval;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getFirst_milestone_payment() {
		return first_milestone_payment;
	}

	public void setFirst_milestone_payment(double first_milestone_payment) {
		this.first_milestone_payment = first_milestone_payment;
	}	

	public NewBusinessLead getNewBusinessLead() {
		return newBusinessLead;
	}

	public void setNewBusinessLead(NewBusinessLead newBusinessLead) {
		this.newBusinessLead = newBusinessLead;
	}

	@Override
	public String toString() {
		return "Scoring [id=" + id + ", province=" + province + ", installation_area=" + installation_area
				+ ", cash_basis=" + cash_basis + ", ceb_connection=" + ceb_connection + ", solar_capacity="
				+ solar_capacity + ", competitive_quotes=" + competitive_quotes + ", inverter_type=" + inverter_type
				+ ", price_range=" + price_range + ", repeat_customer=" + repeat_customer + ", correspondence_records="
				+ correspondence_records + ", site_visit=" + site_visit + ", proposal_sent=" + proposal_sent
				+ ", proposal_negotiation_level=" + proposal_negotiation_level + ", draft_agreement=" + draft_agreement
				+ ", confirmation=" + confirmation + ", pre_approval=" + pre_approval + ", payment=" + payment
				+ ", first_milestone_payment=" + first_milestone_payment + ", newBusinessLead=" + newBusinessLead + "]";
	}
		
}
