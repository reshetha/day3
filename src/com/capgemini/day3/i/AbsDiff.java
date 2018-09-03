package com.capgemini.day3.i;

public class AbsDiff {

	public static int checkAbsDiff(int[] arr, int key) {
		
		int size = arr.length;
		int flag=0;
		for(int i = 0; i < size-1; i++)
		{
			for(int j = i+1; j < size; j++)
			{
				if(Math.abs(i-j) <= key)
				{
					if(arr[i]==arr[j])
					{
						System.out.println("Such a pair exists at positions " + (i+1) + " and " + (j+1));
						flag=1;
					}
				}
			}
		}
		if(flag==1)
		{
			return 1;
		}
		System.out.println("No pair found");
		return 0;
	}	
}

