package com.pos.programs;

import java.util.Scanner;

public class AutomorphicOrCircularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Number:");
           int num = sc.nextInt();
           int gum =0;
           for(int i=3;i<num;i++)
           {
        	   int sim=i*i;

           if(sim>0)
           {
        	 gum=sim; 
        	 System.out.println(gum);
           }
           if(gum%10==num)
           {
        	   System.out.println(i); 
           }
           else if(gum%100==num)
           {
        	   System.out.println(i);
           }
           else if(gum%1000==num)
           {
        	   System.out.println(i);
           }
           else
           {
        	   System.out.println("Not Automorphic Number");
           }
         } 
	  }

    }
