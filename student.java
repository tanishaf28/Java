package main;

import java.util.Scanner;


public class student {
	private String name;
	private int marks[];
	private int tot;
	public String getRollno() {
		return name;
	}
	public void setRollno(String name) {
		this.name=name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks=marks;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot=tot;
	}
	void Classaverage(double classAvg) {
		System.out.println("The class avg marks is: "+(classAvg)/3);
	}
	void subMarksAvg(int[] marks) {
		System.out.println("The avg marks of each subjects are: ");
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("The "+(i+1)+" "+"average is: "+marks[i]);
		}
	}
	void findTop(student[] std) {
		String roll=std[0].getRollno();
		int top=std[0].getTot();
		for(int i=1;i<std.length;i++) {
			if(std[i].getTot()>=top) {
				roll=std[i].getRollno();
			}
		}
		System.out.println("Topper of the class: "+roll);
	}
	void passStudents(student[] std,int pass) {
		System.out.println("The passed student names: ");
		for(int i=0;i<std.length;i++) {
			if(std[i].getTot()>=pass) {
				System.out.println(std[i].getRollno());
			}
		}
	}
	void failStudents(student[] std,int pass) {
		System.out.println("The passed student names: ");
		for(int i=0;i<std.length;i++) {
			if(std[i].getTot()<pass) {
				System.out.println(std[i].getRollno());
			}
		}
	}
}
class Student {
	public static void main(String[] args) {
		double classAvg=0.0d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no.of Students details ");
		int n=sc.nextInt();
		
		student stdDetails[]=new student[n];
		for(int j=0;j<n;j++) {
			System.out.println("Enter the name of the student: ");
			int tot=0;
			String rollno=sc.next();
			System.out.println("Enter 5 sub marks: ");
			int arr[]= new int[5];
			for(int i=0;i<5;i++) {
				arr[i]=sc.nextInt();
				tot+=arr[i];
			}
			student std=new student();
			std.setRollno(rollno);
			std.setMarks(arr);
			std.setTot(tot);
			stdDetails[j]=std;
			classAvg+=std.getTot();
			
		}
		student std=new student();
		std.Classaverage(classAvg);
		int subMarks[]= new int[5];
		for(int i=0;i<5;i++) {
			int tot=0;
			for(int j=0;j<n;j++) {
				tot+=stdDetails[j].getMarks()[i];
			}
			subMarks[i]=tot;
		}
		std.subMarksAvg(subMarks);
		std.findTop(stdDetails);
		System.out.println("Enter the pass marks: ");
		int pass=sc.nextInt();
		std.passStudents(stdDetails, pass);
		std.failStudents(stdDetails, pass);
		
	}
	
}