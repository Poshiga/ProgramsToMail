package com.abc.practice;

public class PrintMiddleCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="poshiga";
          int n= s.length();
          
          if(n%2==0)
          {
        	  System.out.println("Middlecharacter at even :"+" "+s.charAt(n/2));
          }
          else
          {
        	  System.out.println("Middlecharacter at odd :"+" "+s.charAt(n/2));
          }
          
	}

}
