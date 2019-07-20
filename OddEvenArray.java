package com.redington.java.Arrays;

import java.util.Scanner;
public class OddEvenArray {
	int [] numbers = new int[5];
	int [] Odd = new int[5];
	int [] Even = new int[5];
	int i;
	
	public void getInput()
	{
		Scanner scan = new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
			System.out.println("enter the numbers==>" + i + "position");
			numbers[i] = scan.nextInt();
		}
	}
	public void Odd()
	{
		for(i=0;i<=4;i++)
		{
			if(numbers[i]%2==1)
			{
				Odd[i] = numbers[i];
				System.out.println("the odd numbers is==>" + Odd[i]);
			}
		}	
	}
	public void Even()
	{
		for(i=0;i<=4;i++)
		{
			if(numbers[i]%2==0)
			{
				Even[i] = numbers[i];
				System.out.println("the even numbers is==>" + Even[i]);
			}
		}
	}

}
