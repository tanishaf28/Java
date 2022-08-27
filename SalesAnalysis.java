package com.jap.salesanalyzer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.*;

import java.util.Date;
import java.util.regex.*;
/**
This class performs the file reading and stores the data in SalesRecord array
 */
public class SalesAnalysis extends SalesRecord{
    // This method reads a file and returns the count of lines in the file
    // omit any headers present in the file
     public int countOfSalesRecords(String fileName){
         int recordCount = 0;
		 try{
			 BufferedReader r=new BufferedReader(new FileReader(fileName));
			 while(r.readLine()!=null)
			 recordCount++;
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }

        return recordCount-1;
    }

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readRecords(String fileName,int recordCount) throws ParseException,NumberFormatException {
        SalesRecord[] salesData = new SalesRecord[recordCount];
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
        String df="\\d{1,2}-\\d{1,2}-\\d{2}";
        try {
		BufferedReader r=new BufferedReader(new FileReader(fileName));
        
		String c=r.readLine();
		for(int i=0;i<recordCount;i++){
			c=r.readLine();
			String[] s=c.split(",");
			salesData[i]=new SalesRecord(formatter.parse(s[0]),Integer.valueOf(s[1]),Integer.valueOf(s[2]),s[3],Double.parseDouble(s[4]),Double.parseDouble(s[5]),Integer.valueOf(s[6]));
					}
		r.close();
        }catch(IOException i) {
        	i.printStackTrace();
        }
        
        return salesData;
     }

    public static void main(String[] args) throws ParseException,IOException,FileNotFoundException {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        // read the file purchase_details.csv
		String fileName = "src/main/resources/purchase_details.csv";
		BufferedReader r=new BufferedReader(new FileReader(fileName));
		SalesAnalysis s=new SalesAnalysis();

		
        // the count of lines in the file
        int count = s.countOfSalesRecords(fileName);
        //array to hold the sales records
        SalesRecord[] salesRecords = s.readRecords(fileName,count);
		for(int i=0;i<count;i++){
			System.out.println(salesRecords[i].toString());
		}
		r.close();
		

       // display the records that have been read from the file
    }
}
