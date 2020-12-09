package com.abc.practice;

public class CamelCaseToSnakeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="OmNamoNarayana";
          String s1="";
          int n=s.length();
          for(int i=0;i<n;i++)
          {
        	  if(s.charAt(i)>=65 && s.charAt(i)<=90)
        	  {
        		 s1=s1+(char)(s.charAt(i)+32);
        	  }
        	  else
        	  {
        		  s1=s1+s.charAt(i);
        	  }
          }
          String s2="";
          for(int j=0;j<n;j++)
          {
        	  if(s1.charAt(j)!=' ')
        	  {
        		  s2=s2+s1.charAt(j);
        	  }
          }
          System.out.println(s2);
	}

}
