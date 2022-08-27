package com.jap.palindrome;

/* Write a java program to find if any of the words in the list is a palindrome or not, print their count and the palindrome words.*/
public class Palindrome {
    public static void main(String[] args) {
        String[] words = {"civic", "root", "program", "level"};
        Palindrome palindrome = new Palindrome();

        // Call method to find palindromes in array of words
        System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
    }

    // Function to find palindromes in an array of words
    public int findPalindromeWords(String[] words) {
		int count=0;
		int k=1;
		for(String s:words){
			int a= 0,b=s.length()-1;
        while (a<b) {
            if (s.charAt(a) != s.charAt(b)){
				k=0;
                break;
			}
            a++;
            b--;
        }
		if(k!=0){
			System.out.println(s+" is a Palindrome");
			count+=1;
		}
		k=1;
		}
        return count;
    }
}
