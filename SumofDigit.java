package com.redington.java.Arrays;

import java.util.Scanner;
public class SumofDigit {
	int [] numbers = new int[5];
	int [] division = new int[5];
	int [] div= new int[5];
	int reminder;
	
	public void getInput()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the numbers==>" + i);
			numbers[i] = scan.nextInt();
			div[i] = numbers[i];
		}
	}
	public void SumofDigits()
	{
		for(int i=0;i<5;i++)
		{
			int sum=0;
			while(numbers[i]>0)
			{
				int reminder = numbers[i]%10;
				sum = sum+reminder;
				numbers[i] = numbers[i]/10;
				division[i] = sum;
			}
			System.out.println(sum);
		}
		for(int i=0;i<5;i++)
		{
			if(div[i]%division[i]==0)
			{
				System.out.println(div[i] + "the number is divisible");
			}
			else
			{
				System.out.println(div[i] + "the number is not divisible");
			}
		}
		
	}

}
