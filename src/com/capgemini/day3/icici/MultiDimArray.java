package com.capgemini.day3.icici;
public class MultiDimArray {

	public static String search(int[][] arr, int ele) {
		String res ="";
		int flag = 0;
		for(int i = 0 ;i < arr[0].length; i++)
		{
			for(int j = 0 ;j < arr.length; j++)
			{
				if(ele==arr[i][j])
				{
					res = res + "Element found at index = " + i + "," + j;
					res = res +"\n";
					flag=1;
					//System.exit(0);
				}
			}
		}
		if(flag==1)
		{
			return res;
		}
		return "Number not found";
		}
	}




