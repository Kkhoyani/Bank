package Transaction;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class SeprateTransactionTask extends Thread{
	
	private String[] transData;
	private String fileName;

	public SeprateTransactionTask(String[] transData, String fileName) {
		this.transData = transData; 
		this.fileName = fileName;
	}
	
	public synchronized void run() {
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(fileName ,true));
			writer.writeNext(transData);  
	        writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
