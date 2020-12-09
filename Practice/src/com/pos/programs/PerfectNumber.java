package com.pos.programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num = sc.nextInt();
	    int sum=0;
          for(int i=1;i<num;i++)
          {
        	  if(num%i==0)
        	  {
        		  sum=sum+i;
        	  }
          }
          System.out.println(sum);
          if(sum>num)
          {
        	  System.out.println("Abundant Number");
          }
          else if(sum==num)
          {
        	  System.out.println("Perfect Number");
          }
          else 
          {
        	  System.out.println("Deficiency Number");
          }
          
	}

}
