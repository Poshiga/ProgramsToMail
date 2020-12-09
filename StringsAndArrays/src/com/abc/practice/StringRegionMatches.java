package com.abc.practice;

public class StringRegionMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1 = new String("Abhishek Rout");
         String s2 = new String("abhishek");
         String s3 = new String("ABHISHEK");
          
         //comparing s1 & s2
         System.out.print("Comparing s1 and s2:"+" ");
         System.out.println(s1.regionMatches(0, s2, 0, 8));
         
         //comparing s2 & s3
         System.out.print("Comparing s2 and s3:"+" ");
         System.out.println(s2.regionMatches(true, 0, s3, 0, 8));
         
         //comparing s1 & s3
         System.out.print("Comparing s1 and s3:"+" ");
         System.out.println(s1.regionMatches(true, 0, s3, 0, 8));
	}

}
