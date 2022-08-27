package com.jap.weightedaveragecalculator;

import java.util.Scanner;

public class WeightedAverageCalculation {

  // Function accepts academic scores as input parameters and outputs the overall
  // weighted average percentage of an individual.
  //Calculate the Overall Percentage
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  int assignmentScore=sc.nextInt();
	  int projectScore=sc.nextInt();
	  int quizScore=sc.nextInt();
	  int midTermScore=sc.nextInt();
	  int finalExamScore=sc.nextInt();
	  WeightedAverageCalculation w=new WeightedAverageCalculation();
	  float overall=w.averageCalculation(assignmentScore,projectScore,quizScore,midTermScore,finalExamScore);
	  System.out.println("Overall Percentage :"+overall);
	  
  }

  public float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore,
      int finalExamScore) {
		  System.out.println("Weights			% value of score");
		  System.out.println("Assignments		"+assignmentScore*0.1f);
		  System.out.println("Projects			"+projectScore*0.35f);
		  System.out.println("Quiz				"+quizScore*0.1f);
		  System.out.println("Mid term			"+midTermScore*0.15f);
		  System.out.println("Final Exam		"+finalExamScore*0.3f);
		  float overallPercentage=assignmentScore*0.1f+projectScore*0.35f+quizScore*0.1f+midTermScore*0.15f+finalExamScore*0.3f;
      return overallPercentage;
  }

}
