package com.redington.java.Arrays;

import java.util.Scanner;
public class PositiveNegative {
	int [] numbers = new int[20];
	int positive,negative,odd,even;
	int i;
	public void getInput()
	{
		Scanner scan = new Scanner(System.in);
		for(i=0;i<=19;i++)
		{
			System.out.println("Enter the numbers " + i + "position");
			numbers[i] = scan.nextInt();	
		}
	}
	public void Positive()
	{
		System.out.println(" ");
		for (i=0;i<=19;i++)
		{
		if(numbers[i]>0)
		{
			positive++;
			System.out.println("the positive numbers is==>" + numbers[i]);
		}
		}
	}
		public void Negative()
		{
			System.out.println(" ");
			for(i=0;i<=19;i++)
			{
		if(numbers[i]<0)
		{
			negative++;
			System.out.println("the negative numbers is==>" + numbers[i]);
		}
			}
		}
		public void Even()
		{
			System.out.println(" ");
			for(i=0;i<=19;i++)
			{
		if(numbers[i]%2==0)
		{
			even++;
			System.out.println("the even numbers is==>" + numbers[i]);
		}
		}
		}
    public void Odd()
    {
    	System.out.println(" ");
    	for(i=0;i<=19;i++)
    	{
		if(numbers[i]%2==1)
		{
			odd++;
			System.out.println("the odd numbers is==>" + numbers[i]);
		}
    	}
	}
	}

