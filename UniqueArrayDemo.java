package com.jap.uniquearray;



public class UniqueArrayDemo {

    public static void main(String[] aa) {

        //declare and initialize integer Array in numberArray Variable

        int [] numberArray = {101,105,106,107,108,109};
        UniqueArrayDemo uniqueArrayDemo = new UniqueArrayDemo();
        boolean result = uniqueArrayDemo.getUniqueArrayElement(numberArray);
        System.out.println(result);


    }


    public boolean getUniqueArrayElement(int numberArray[]){
        boolean result = false;
		int c=0;
		for(int i=0;i<numberArray.length;i++){
			for(int j=i+1;j<numberArray.length;j++){
				if(numberArray[i]==numberArray[j])
				return false;
			}
		}
        return true;
    }

}