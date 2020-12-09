package com.abc.practice;

import java.util.Scanner;

public class UnicodeForGivenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String:");
         String s = sc.nextLine();
         
         for(int i=0;i<s.length();i++)
         {
        	 //if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122)
        	 //{
        		 System.out.println("unicode point at "+" "+s.charAt(i)+"="+" "+(int)s.charAt(i));
        	 //}
        	 
         }
	}

}
