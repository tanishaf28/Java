package com.jap.sortwords;
import java.util.Arrays;

/* Write a Java program to sort all of the words in the list in alphabetical order and display */
public class SortWords {
    public static void main(String[] args) {
        String[] words = {"Ajay", "Gaurav", "Rahul", "Suresh"};

        SortWords sortWords = new SortWords();
        // Call method to sort words alphabetically
        String[] sortedWords = sortWords.sort(words);

        // Display the words after sorting alphabetically
    }

    public String[] sort(String[] words) {
		int size = words.length;   
		for(int i = 0; i<size-1; i++)   
		{  
			for (int j = i+1; j<words.length; j++)   
			{   
				if((words[i].toLowerCase()).compareTo(words[j].toLowerCase())>0)   
					{    
					String temp = words[i];  
					words[i] = words[j];  
					words[j] = temp;  
					}  
				}  
			}  
        return words;
    }
}
