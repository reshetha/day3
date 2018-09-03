package com.capgemini.day3.icici.domain;
public class DeleteSpaceAndWord {

	public static String modify(String sentence, String word, int pos) {
		String res="";
		int i;
		for(i=0; i < sentence.length()-1; i++)
		{
			if(sentence.charAt(i)==sentence.charAt(i+1) && sentence.charAt(i)==' ')
			{
				
			}
			else
			{
				res = res + sentence.charAt(i);
			}
		}
		res = res + sentence.charAt(i);
		sentence = res;
		res = "";
		int ct=0;
		for(i = 0; i < sentence.length();i++)
		{
			if(sentence.charAt(i)==' ')
			{
				ct++;
				if(ct==(pos-1))
				{
					res = sentence.substring(0, i+1) + sentence.substring(i+2+word.length());
				}
			}
		}
		return res;
	}

}




}
