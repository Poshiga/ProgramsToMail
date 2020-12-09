package com.abc.practice;

import java.util.Scanner;

public class PrintFirstKcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="omnamonarayana";
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the kvalue:");
         
         int kvalue = sc.nextInt();
         
         /*//using inbuilt method
         System.out.println(str.substring(0,kvalue));*/
         
         for(int i=0;i<kvalue;i++)
         {
        	System.out.print(str.charAt(i));
         }
	}

}
