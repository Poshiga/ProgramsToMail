package com.abc.practice;

public class StringIntoAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="geeksgeeks";
           int n=s.length();
           String ns="for";
           int e=4;
           String s1="";
           for(int i=0;i<s.length();i++)
           {
        	   s1=s1+s.charAt(i);
        	   if(e==i)
        	   {
        		   s1=s1+ns;
        	   }
           }
          System.out.println(s1);
	}

}
