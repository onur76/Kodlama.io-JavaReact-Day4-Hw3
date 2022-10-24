package Entities;

public class Campaign {

	private int id;
	private String name;
	private double campaignPercentage;
	
	
	public Campaign(int id, String name, double campaignPercentage) {
		this.id = id;
		this.name = name;
		this.campaignPercentage = campaignPercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCampaignPercentage() {
		return campaignPercentage;
	}

	public void setCampaignPercentage(double campaignPercentage) {
		this.campaignPercentage = campaignPercentage;
	}
	

}
