package com.miit.Transaction;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.miit.Account.TransactionData;

public class checkTrans {
	
	public static void main(String[] args) throws Exception {
		
		FatchData f1 = new FatchData();
		
		List<TransactionData> getTransactionData = f1.readCSVfile("myFile0.csv");
		
		Seprate_transaction s = new Seprate_transaction();
		
		ExecutorService executorService = Executors.newFixedThreadPool(6);
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println("Start Time >>>>>>>"+ts);
		
		for (TransactionData transactionData : getTransactionData) {
			if (transactionData.getTransactionType().equalsIgnoreCase("c")) {
				SeprateTransactionTask task1 = new SeprateTransactionTask(s.convertData(transactionData),"E:\\creditData.csv");
				executorService.submit(task1);
			}
			else if(transactionData.getTransactionType().equalsIgnoreCase("d")) {
				SeprateTransactionTask task2 = new SeprateTransactionTask(s.convertData(transactionData),"E:\\debitData.csv");
				executorService.submit(task2);
			}
			else {
				SeprateTransactionTask task3 = new SeprateTransactionTask(s.convertData(transactionData),"E:\\errorData.csv");
				executorService.submit(task3);
			}
		}
		
		 executorService.shutdown();
		 
		 executorService.awaitTermination(60,  TimeUnit.SECONDS);
		 Timestamp ts1 = new Timestamp(System.currentTimeMillis());
		 System.out.println("End Time >>>>>>>>"+ts1);
	}

}

//Start Time >>>>>>>2023-10-14 14:33:24.82
//End Time >>>>>>>>2023-10-14 14:33:57.579

