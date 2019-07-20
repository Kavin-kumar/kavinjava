package com.redington.java.Arrays;

import java.util.Scanner;
public class ReversetheNumber {
	int [] numbers = new int[5];
	int [] reverse = new int[5];
	int i;

	public void getInput()
	{
		for(i=0;i<=4;i++)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers==>");
		numbers[i] = scan.nextInt();
		}
	}
	public void Display()
	{
		for(i=4;i>=0;i--)
		{
			reverse[i] = numbers[i];
			System.out.println(reverse[i]);
		}
	}
}

