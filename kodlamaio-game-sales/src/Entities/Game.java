package Entities;

public class Game {
	
	private int id;
	private String name;
	private double price;
	private double campaignPrice;
	
	public Game(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Game(int id, String name, double price, double campaignPrice) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.campaignPrice = campaignPrice;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getCampaignPrice() {
		return campaignPrice;
	}

	public void setCampaignPrice(double campaignPrice) {
		this.campaignPrice = campaignPrice;
	}

}
