package com.jap.oops;

public class StudentMarks {

    /* adding 4 integer values.*/


    public int calculateMarks(int physics, int chemistry, int maths) {


        return physics+chemistry+maths;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio) {


        return physics+chemistry+maths+bio;
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio) {


        return physics+chemistry+maths+bio;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {


        return maths+bio+physics+chemistry+lang;
    }


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry) {



        return maths+bio+physics+chemistry;
    }
	 public static void main(String args[]) {
    	StudentMarks sm= new StudentMarks();
    	System.out.println(sm.calculateMarks(100, 100, 100));
    	System.out.println(sm.calculateMarks(100, 100, 100, 98));
    	System.out.println(sm.calculateMarks(98.58, 98.56, 99.97, 98.08));
    	System.out.println(sm.calculateMarks(98.58f, 98.56f, 99.97f, 98.08f));
}

}
