package com.jap.averageofintegers;


public class AverageAge
{
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData)
    {
		float d=0;
		for(int i=0;i<ageRawData.length;i++){
			try{
				d+=Integer.valueOf(ageRawData[i]);
			}catch(Exception e){
				return "java.lang.NumberFormatException: For input string: \""+ageRawData[i]+"\"";
			}
		}
		float i=d/ageRawData.length;
       return String.valueOf(i);
    }


}
