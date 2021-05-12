package com.example.javausecase.corejava.telecomprocess;

public class TeleCustomer {
    Integer custId;
	String customerName;
	String baseCountry;
	String address;
	boolean active;
	String phoneNumber;
	String avlCredits;
	String is4g;
	Integer billAmount;
	String description;	
	public TeleCustomer(Integer custId, String customerName, String baseCountry, String address, boolean active,
			String phoneNumber, String avlCredits, String is4g, Integer billAmount, String description) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.baseCountry = baseCountry;
		this.address = address;
		this.active = active;
		this.phoneNumber = phoneNumber;
		this.avlCredits = avlCredits;
		this.is4g = is4g;
		this.billAmount = billAmount;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + custId + ", customerName=" + customerName + ", baseCountry=" + baseCountry
				+ ", address=" + address + ",isActive="+ active + ", phoneNumber=" + phoneNumber + ", avlCredits=" + avlCredits + ", is4g="
				+ is4g + ", billAmount=" + billAmount + ", description=" + description +   "]";
	}
	public Integer getCustomerId() {
		return custId;
	}
	public void setCustomerId(Integer custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBaseCountry() {
		return baseCountry;
	}
	public void setBaseCountry(String baseCountry) {
		this.baseCountry = baseCountry;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAvlCredits() {
		return avlCredits;
	}
	public void setAvlCredits(String avlCredits) {
		this.avlCredits = avlCredits;
	}
	public String getIs4g() {
		return is4g;
	}
	public void setIs4g(String is4g) {
		this.is4g = is4g;
	}
	public Integer getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
