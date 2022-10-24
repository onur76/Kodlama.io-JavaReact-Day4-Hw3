package Entities;

public class Player {
	
	private int id;
	private String fullName;
	private String lastName;
	private String nationalId;
	private int birthYear;
	private double balance;
	
	
	public Player(int id, String fullName, String lastName, String nationalId, int birthYear, double balance) {
		this.id = id;
		this.fullName = fullName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthYear = birthYear;
		this.balance = balance;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFirstName(String firstName) {
		this.fullName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
