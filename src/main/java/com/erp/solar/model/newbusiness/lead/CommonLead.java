package com.erp.solar.model.newbusiness.lead;

public class CommonLead {
	protected NewBusinessLead newBusinessLead;
	protected LeadSite leadSite;
	protected Scoring scoring;
		
	public CommonLead(NewBusinessLead newBusinessLead, LeadSite leadSite, Scoring scoring) {
//		super();
		this.newBusinessLead = newBusinessLead;
		this.leadSite = leadSite;
		this.scoring = scoring;
	}

	public NewBusinessLead getNewBusinessLead() {
		return newBusinessLead;
	}

	public void setNewBusinessLead(NewBusinessLead newBusinessLead) {
		this.newBusinessLead = newBusinessLead;
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

	@Override
	public String toString() {
		return "CommonLead [newBusinessLead=" + newBusinessLead + ", leadSite=" + leadSite + ", scoring=" + scoring
				+ "]";
	}
	
}
