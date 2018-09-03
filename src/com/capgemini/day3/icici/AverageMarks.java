package com.capgemini.day3.icici;
public class AverageMarks {

	public static int[][] subAverageAndTotal(int[][] marks) 
	{
		int subTotal[][] = new int[3][2];
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0 ;j < 3; j++)
			{
				subTotal[j][1] += marks[i][j];
				
			}
		}
		for(int i=0;i<3;i++)
		{
			subTotal[i][0] = subTotal[i][1]/3;		
		}
			return subTotal;
			
	}

	public static int[][] studentAverageAndTotal(int[][] marks) 
	{
		int stuTotal[][] = new int[3][2];
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0 ;j < 3; j++)
			{
				stuTotal[i][1] += marks[i][j];
				
			}
		}
		for(int i=0;i<3;i++)
		{
			stuTotal[i][0] = stuTotal[i][1]/3;		
		}
		
		return stuTotal;
	}

}
