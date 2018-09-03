package com.capgemini.day3.icici;

public class WordRev {

	public static String reverseString(String sentence) {
		String words[] = sentence.split(" ");
		String ans="";
		for(int i=0; i < words.length ; i++)
		{
		String rev="";
		for(int j=words[i].length()-1; j>=0; j--)
		{
			rev = rev + words[i].charAt(j);
		}
		ans = ans + rev + " ";
		}
		return ans;
	}

}


