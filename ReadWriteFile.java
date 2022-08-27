package com.jap.filedemo;

import java.io.*;
import java.lang.String;

public class ReadWriteFile {

    public static void main(String[] args) {
   ReadWriteFile readWriteFile = new ReadWriteFile();
        try {
            readWriteFile.readDataFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //create object of Readers and writers
    public void readDataFromFile() throws IOException {
		FileReader f=new FileReader("input.txt");
		String csv="";
		int i;
		while((i=f.read())!=-1){
			csv+=(char)i;
		}
		String[] res=csv.split(",");
		FileWriter fo=new FileWriter("output.txt");
		for(i=0;i<res.length;i++){
			fo.write(res[i].substring(0,1).toUpperCase()+res[i].substring(1).toLowerCase());
			if(i!=res.length-1)
			fo.write(",");
		}
		f.close();
		fo.close();



    }
}
