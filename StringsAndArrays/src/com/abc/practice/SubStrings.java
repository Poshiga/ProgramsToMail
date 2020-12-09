package com.abc.practice;

import java.util.ArrayList;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="The cat";
          ArrayList<String> al = new ArrayList<String>();
          for(int i=0;i<s.length();i++)
          {
        	  for(int j=i+1;j<=s.length();j++)
        	  {
        		 al.add(s.substring(i,j));
        	  }
          }
          System.out.println("the substrings are:"+" "+al);
          int count=1;
          for(String fin:al)
          {
        	  System.out.println(count+" "+fin);
        	  count++;
          }
	}

}
