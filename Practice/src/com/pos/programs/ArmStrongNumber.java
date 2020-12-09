package com.pos.programs;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number:");
          int num = sc.nextInt();
          int armnum = num;
          int rem =0;
          int cub=0;
          while(num>0)
          {
        	  rem =num%10;
        	  num =num/10;
        	  cub = cub+(rem*rem*rem);
          }
          if(cub==armnum)
          {
        	  System.out.println("It is an ArmStrong Number"+":"+cub);
          }
          else
          {
        	  System.out.println("It's not an ArmStrong Number"+":"+cub);
          }
	}

}
