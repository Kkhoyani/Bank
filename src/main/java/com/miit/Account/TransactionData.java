package com.miit.Account;

public class TransactionData {
	
	private String transactionId;
	
	private String category;
	
	private String descreption;
	
	private float amount;
	
	private String transactionDate;
	
	private String transactionType;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public TransactionData(String transactionId, String category, String descreption, float amount,
			String transactionDate, String transactionType) {
		super();
		this.transactionId = transactionId;
		this.category = category;
		this.descreption = descreption;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
	}

	public TransactionData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
