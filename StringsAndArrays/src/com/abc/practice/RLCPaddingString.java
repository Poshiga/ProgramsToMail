package com.abc.practice;

import java.util.Scanner;

public class RLCPaddingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="GfG";
           char give='_';
           int n=s.length();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the length:");
           int len = sc.nextInt();
           int res=len-n;//space to print special character
           
           //leftpadding
           for(int i=0;i<len;i++)
           {
        	   if(i<res)
        	   {
        	   System.out.print(give+" ");
        	   }
           }
           System.out.println(s);
           
           //centrepadding for odd
           if(n%2==1)
           {
           for(int i=0;i<res;i++)
           {
        	   if(i<res/2)
        	   {
        		   System.out.print(give+" ");
        	   }
           }
           System.out.print(s);
           for(int j=0;j<res;j++)
           {
        	   if(j>=res/2)
        	   {
        		   System.out.print(give+" ");
        	   }
           }
           System.out.println();
           }
           
           //centrepadding for even
           if(n%2==0)
           {
           for(int i=0;i<res;i++)
           {
        	   if(i<res/2)
        	   {
        		   System.out.print(give+" ");
        	   }
           }
           System.out.print(s);
           for(int j=0;j<res;j++)
           {
        	   if(j>=res/2)
        	   {
        		   System.out.print(give+" ");
        	   }
           }
           System.out.println();
           }
           //rightpadding
           System.out.print(s);
           for(int i=0;i<len;i++)
           {
        	   if(i>=n)
        	   {
        		   System.out.print(give+" ");
        	   }
           }
	}

}
