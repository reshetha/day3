package com.capgemini.day3.icici;

public class DuplicateRemover {

	public static String modify(String sentence) {
		String res="";
		for(int i=0;i < sentence.length(); i++)
		{
			int flag = 0;
			for(int j=0;j < res.length(); j++)
			{
				if(sentence.charAt(i)==res.charAt(j))
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				res = res + sentence.charAt(i);
			}
		}
		return res;
	}



}
