package com.redington.java.Arrays;

import java.util.Scanner;
public class SumofDigits {
	int [] numbers = new int[5];
	int [] ascending = new int[5];
	int [] descending = new int[5];
	int j,temp;
	
	public void getInput()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			System.out.println("enter the Array Values==>" + i);
			numbers[i] = scan.nextInt();
		    ascending[i] = numbers[i];
		    descending[i] = numbers[i];
		}
	}
	public void ascending()
	{
		for(int i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(ascending[i] > ascending[j])
				{
					temp = ascending[i];
					ascending[i] = ascending[j];
					ascending[j] = temp;
				}
			}
		}
		System.out.print("ascending order==>");
		for(int i=0;i<5;i++)
		{
			System.out.print(ascending[i]+ " , ");
		}
	  }
	public void desending()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(descending[i] < descending[j])
				{
					temp = descending[i];
					descending[i] = descending[j];
					descending[j] = temp;
				}
			}
		}
		System.out.println( );
		System.out.print("descending order==>");
		for(int i=0;i<5;i++)
		{
			System.out.print(descending[i] + " , ");
		}
	}
 }
