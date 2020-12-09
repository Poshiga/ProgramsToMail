package com.pos.programs;

import java.util.Scanner;

public class PrintPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Number:");
           int num = sc.nextInt();
           int count=0;
         for(int i=1;i<num;i++)
           {
        	   for(int j=2;j<i;j++)
        	   {
        		   if(i%j==0)
        		   {
        			 count++;
        		   }
        	   }
        	   if(count==0)
        		   {
        		   System.out.print(i+" ");
        		   }
        	   else
        	   {
        		   count=0;
        	   }
        		   } 
	}


}
