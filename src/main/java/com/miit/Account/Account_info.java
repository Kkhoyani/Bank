package com.miit.Account;

public class Account_info {
	private String Username;

	private String password;
	
	private String accountType;
	
	private String accountNumber;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account_info(String username, String password, String accountType, String accountNumber) {
		super();
		Username = username;
		this.password = password;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}

}
