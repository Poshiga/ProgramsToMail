package com.abc.practice;

import java.util.Scanner;

public class GenerateRandomStringOfGivenSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the size:");
           int size = sc.nextInt();
           
           String rs="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnoprstuvwxyz"+"0123456789";
           
           StringBuilder sb = new StringBuilder(size);//default size of StringBuilder is 16
           String str="";
           for(int i=0;i<size;i++)
           {
        	      int e =(int)(rs.length()*Math.random());
        	      sb.append(e);
           }
           //System.out.println(str);
           System.out.println("String builder:"+" "+sb);
           
	}

}
