 package com.abc.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateToStringConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            /*Scanner sc = new Scanner(System.in);
            System.out.println("Enter the date:");
            String date = sc.nextLine();*/
		String date="27-04-1954";
            String convdate = dateToString1(date);
            System.out.println("converted datetostring :"+" "+convdate);
	}
	public static String dateToString1(String date)
	{
	          DateFormat sdf = new SimpleDateFormat(date);
	           Date  d = Calendar.getInstance().getTime();
	           String s = sdf.format(date);
	           return s;
	}
	
	//using LocalDate.toString() method
	/*public static String dateToString(String date)
	{
		LocalDate ld = LocalDate.parse(date);
		String convdate = ld.toString();
		return convdate;
	}*/
	

}
