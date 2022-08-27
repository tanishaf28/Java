package com.jap.replaceinteger;

public class ArrayPairSum {

    public static void main(String[] aa) {

        //Declare and initialize integer array in the variable numberArray
        int[] numberArray=null;
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
        //write forEach loop to iterate through the 'sumArray' to print the output



    }

    public int[] sumOfArrayPair(int numberArray[]){
		int arr[]=new int[numberArray.length%2==0?numberArray.length/2:(numberArray.length+1)/2];
		if(numberArray.length%2==0)
		{
			int j=0;
			for(int i=0;i<numberArray.length;i+=2)
			arr[j++]=numberArray[i]+numberArray[i+1];
		}
		else{
			int j=0;
			for(int i=0;i<numberArray.length-1;i+=2)
			arr[j++]=numberArray[i]+numberArray[i+1];
			arr[j]=numberArray[numberArray.length-1];
		}
        return arr;
    }

}
