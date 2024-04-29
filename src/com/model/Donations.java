package com.model;

public class Donations {
	private int id;
	private String donor_name;
	private int amount;
	private String donation_type;
	private String item_type;
	private String donation_date;
	public Donations(int id, String donor_name, int amount, String donation_type, String item_type,
			String donation_date) {
		super();
		this.id = id;
		this.donor_name = donor_name;
		this.amount = amount;
		this.donation_type = donation_type;
		this.item_type = item_type;
		this.donation_date = donation_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonor_name() {
		return donor_name;
	}
	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDonation_type() {
		return donation_type;
	}
	public void setDonation_type(String donation_type) {
		this.donation_type = donation_type;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public String getDonation_date() {
		return donation_date;
	}
	public void setDonation_date(String donation_date) {
		this.donation_date = donation_date;
	}
	@Override
	public String toString() {
		return "Donations [id=" + id + ", donor_name=" + donor_name + ", amount=" + amount + ", donation_type="
				+ donation_type + ", item_type=" + item_type + ", donation_date=" + donation_date + "]";
	}
	
	
}
