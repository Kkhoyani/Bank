package com.miit.Transaction;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.miit.Account.TransactionData;
import com.opencsv.CSVReader;

public class FatchData {

	List<TransactionData> transData = new ArrayList<>();

	private TransactionData createDataObject(String[] data) {
		float amount = Float.parseFloat(data[3]);
		return new TransactionData(data[0], data[1], data[2], amount, data[4], data[5]);
	}

	public List<TransactionData> readCSVfile(String fileName) throws IOException {
		try {
			CSVReader csvFile = new CSVReader(new FileReader(fileName));
			String[] newLine;
			String[] headerLine = csvFile.readNext();
			while ((newLine = csvFile.readNext()) != null) {
				float amount = Float.parseFloat(newLine[3]);
				TransactionData transDataItem = createDataObject(newLine);
				transData.add(transDataItem);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return transData;
	}

}
