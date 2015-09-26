package com.main;

public class Highest {
	
	public static int findHighest(int[] arr)
	{
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,34,56,78,90};
		int minimum = findHighest(arr);
		System.out.println("The highest number in array is " + minimum);
	}


}
