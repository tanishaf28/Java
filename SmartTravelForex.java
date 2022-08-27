package com.jap.masterychallenge1;

import java.util.Scanner;

public class SmartTravelForex {
	
	static final double JPY = 0.67;
	static final double EUR = 85.37;
	static final double GBP = 94.5;
	static final double USD = 74.3;
	static final double AED = 20.25;
	static final double d[]={0.67,85.37,94.5,74.3,20,25};
    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {
		if(amount<0)
		return -1;
	   	if(choice==1)
		   return JPY*amount;
		else if(choice==2)
			return EUR*amount;
		else if(choice==3)
			return GBP*amount;
		else if(choice==4)
			return USD*amount;
		else
			return AED*amount;
		

	   
    }

    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
			if(amountToBeConverted<0||sourceCurrency==targetCurrency)
			return -1;
			double amt=currentExchangeRates(amountToBeConverted,sourceCurrency);
			if(targetCurrency==1)
		   return amt/JPY;
		else if(targetCurrency==2)
			return amt/EUR;
		else if(targetCurrency==3)
			return amt/GBP;
		else if(targetCurrency==4)
			return amt/USD;
		else
			return amt/AED;

    }

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
		System.out.println("\t\t1\t\t10\t\t20\t\t50\t\t100");
		System.out.println("JPY\t\t"+d[0]+"\t\t"+d[0]*10+"\t\t"+d[0]*20+"\t\t"+d[0]*50+"\t\t"+d[0]*100);
		System.out.println("EUR\t\t"+d[1]+"\t\t"+d[1]*10+"\t\t"+d[1]*20+"\t\t"+d[1]*50+"\t\t"+d[1]*100);
		System.out.println("GBP\t\t"+d[2]+"\t\t"+d[2]*10+"\t\t"+d[2]*20+"\t\t"+d[2]*50+"\t\t"+d[2]*100);
		System.out.println("USD\t\t"+d[3]+"\t\t"+d[3]*10+"\t\t"+d[3]*20+"\t\t"+d[3]*50+"\t\t"+d[3]*100);
		System.out.println("AED\t\t"+d[4]+"\t\t"+d[4]*10+"\t\t"+d[4]*20+"\t\t"+d[4]*50+"\t\t"+d[4]*100);



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = 0;
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = 0;
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = 0;
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }

}
