package com.hsbc.model.beans;

public class Account {
	private int accountNumber;
	private String customerName;
	private double balance;
	private long contactNumber;
	
	private static int accountNoCount = 1;
	
	public Account(){
		super();
		this.accountNumber = accountNoCount++;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Account [AccountId=" + accountNumber + ", Name=" + customerName + ", balance =" + balance + "phone=" + contactNumber + "]";
	}
	// generate account number at the time of object creation
	// generate required constructors, getters & setters
}
