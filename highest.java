package main;
import java.util.Scanner;
public class highest {
	String find(String arr[],String arr1[]) {
		float s=0;
		int h=0;
		try {
		for(int i=0;i<10;i++) {
			if(Integer.valueOf(arr1[i])>Integer.valueOf(arr1[h])) {
				h=i;
			}
			s+=Integer.valueOf(arr1[i]);
		}
		}catch(Exception e) {
			return e.toString();
		}
		System.out.println("The Average score of 10 schools is"+s/arr1.length);
		return "The highest scorer in quiz is "+arr[h]+" with a scoe of "+arr1[h];
		
	}
	public static void main(String args[]) {
		String arr[]=new String[10];
		String arr1[]=new String[10];
		Scanner sc=new Scanner(System.in);
		try {
		for(int i=0;i<10;i++) {
			System.out.println("Enter school name");
			arr[i]=sc.next();
			System.out.println("Enter marks");
			arr1[i]=sc.next();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		highest h=new highest();
		System.out.println(h.find(arr, arr1));
	}
}
