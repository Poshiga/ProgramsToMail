package com.abc.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //System.out.println("Enter the array size");
          //Scanner sc = new Scanner(System.in);
          //int n = sc.nextInt();
          int[] a =new int[ ]{1,2,3,4};
          
          /*System.out.println("Enter the array elements");
          for(int i=0;i<a.length;i++)
          {
        	  for(int j=0;j<a[i].length;j++)
        	  {
        		  a[i][j]=sc.nextInt();  
        	  }
          }
          for(int i=0;i<a.length;i++)
          {
        	  for(int j=0;j<a[i].length;j++)
        	  {
        		  System.out.print("["+a[i][j]+"]");
        		 
        	  }
              System.out.println();	  
          }*/
          System.out.println("Arrays converted to string:"+" "+Arrays.toString(a));
                   
      }

}
