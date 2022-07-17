package com.jap.shortestword;
import java.util.Scanner;

/* "Write a Java program to get the strings as input from the user and push them to an array.
 Find the shortest word in the list of Strings and output the same on screen.*/
public class ShortestWord {
    public static void main(String[] args) {
        // Input number of words in array using scanner
        int numberOfWords = 0;


        // Input array of words to be compared using scanner
        String[] words = new String[]{};

        ShortestWord shortestWord = new ShortestWord();
        // Call the method and display shortest word in array of words
		shortestWord.findShortestWord(words);
        System.out.println("Shortest word is " + shortestWord.findShortestWord(words));
    }

    // Function to find shortest word in array of words
    public String findShortestWord(String[] words) {

        String result="Cannot find shortest word as array is empty";
		int value[]= new int[words.length];

		 if (words.length==0)
        {
            return result;
        }
		else if (words.length>0)
		{
        char convert[] = words[0].toCharArray();
        for (int j = 0; j < convert.length; j++)
        {
            value[0]=j;
        }

        char convert1[] = words[1].toCharArray();
        for (int j = 0; j < convert1.length; j++)
        {
            value[1]=j;
        }

        char convert2[] = words[2].toCharArray();
        for (int j = 0; j < convert2.length; j++)
        {
            value[2]=j;
        }

        char convert3[] = words[3].toCharArray();
        for (int j = 0; j < convert3.length; j++)
        {
            value[3]=j;
        }
	

        int temp=0;
        String temp2=null;

        for (int i=0; i< words.length; i++)
        {
            for (int j=0; j< words.length-1; j++)
            {
                if (value[j]>value[j+1])
                {
                    temp=value[j];
                    value[j]=value[j+1];
                    value[j+1]=temp;

                    temp2=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp2;

                }

            }
		}
		  
            result=words[0];
		    return result;
        }
		result=words[0]; 
		    return result;
        
    }
}

