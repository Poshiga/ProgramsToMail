 package com.abc.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConvertingInputStreamtoString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
                   Scanner sc = new Scanner(System.in);
                System.out.println("Enter the path:");
                 String file= sc.nextLine();
                 
                 //using InputStreamReader class
               /*  InputStream is  = new FileInputStream(file);
                 
                 //InputStreamReader class
                 InputStreamReader isr = new InputStreamReader(is);
                 
                 //creating character array
                 char charArray[]=new char[file.length()];
                 
                 isr.read(charArray);
                 
                 String con = new String(charArray);
                 
                 System.out.println(con);*/
                 
                 //using BufferReader class
               /*  FileInputStream fis = new FileInputStream(file);
                 InputStreamReader isr = new InputStreamReader(fis);
                 BufferedReader br = new BufferedReader(isr);
                 
                 StringBuffer sb = new StringBuffer();
                 String str;
                 while((str=br.readLine())!=null)
                 {
                	 sb.append(str);
                 }
                 System.out.println(sb.toString());*/
                 
                 
                 //Using Scanner class
                 FileInputStream fis = new FileInputStream(file);
                 InputStreamReader isr = new InputStreamReader(fis);
                 
                 Scanner s = new Scanner(isr);
                 
                 StringBuffer sb= new StringBuffer();
                 while(s.hasNext())
                 {
                	 sb.append(s.nextLine());
                 }
                 System.out.println(sb.toString());
          }

}
