package com.miit.Transaction;

import com.miit.Account.TransactionData;

public class Seprate_transaction {

	private TransactionData transData;
	
	public Seprate_transaction() {
		// TODO Auto-generated constructor stub
	}

	public Seprate_transaction(TransactionData transData) {
		super();
		this.transData = transData;
	}

	public String[] convertData(TransactionData data) {
		return new String[] { data.getTransactionId(), data.getDescreption(), data.getCategory(),
				String.valueOf(data.getAmount()), data.getTransactionDate(), data.getTransactionType() };
	}

}