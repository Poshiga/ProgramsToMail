package com.pos.programs;

import java.util.Scanner;

public class PrintRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Firstnum");
         int fnum = sc.nextInt();
         System.out.println("Enter the Lastnum");
         int lnum = sc.nextInt();
         int rnum = fnum + ((int)Math.random()*((lnum-fnum)+1));
         System.out.println(rnum);
	}

}
