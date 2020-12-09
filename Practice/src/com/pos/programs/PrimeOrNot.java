package com.pos.programs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();int c =0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				c++;
				break;
			}
		}
		if(c>0)
		{
			System.out.println("Not Prime");
			
		}
		else
		{
			System.out.println("Prime");
		}
		}
		
	}


