package com.abc.practice;

import java.util.Arrays;

public class ConvertListOfCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             char[] c ={'a','b','c','d','e'};
             String s="";
             for(int i=0;i<c.length;i++)
             {
            	 System.out.println("Array characters:"+" "+c[i]);
             }
             System.out.println("String:"+" "+Arrays.toString(c));
             for(int j=0;j<c.length;j++)
             {
            	s=s+c[j]; 
             }
             //System.out.println("String:"+" "+s);
	}

}
