package com.redington.java.Arrays;

import java.util.Scanner;
public class SubArray {
	int [] numbers = new int[10];
	int i;
	int start;
	int end;
	Scanner scan = new Scanner(System.in);
	
	public void getInput()
	{
		//Scanner scan = new Scanner(System.in);
		for(i=0;i<=9;i++)
		{
			System.out.println("Enter the numbers==>" + i);
			numbers[i] = scan.nextInt();
		}
	}
	public void Display()
	{
		System.out.println("enter the start number==>");
		start = scan.nextInt();
		for(i=start;i<=start;i++)
		{
			//for(i=start;i<=start;i++)
			{
			  i = start;
			}
			System.out.println(i);
		}
		for(i=end;i<=end;i++)
		{
			System.out.println("Enter the ending value==>");
			end = scan.nextInt();
			//for(i=end;i>=end;i++)
			{
				i=end;
			}
			System.out.println(i);
		}
	}
	public static void main(String[]args)
	{
		SubArray sa = new SubArray();
		sa.getInput();
		sa.Display();
	}

}
