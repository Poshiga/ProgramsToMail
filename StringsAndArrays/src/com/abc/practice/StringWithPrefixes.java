package com.abc.practice;

public class StringWithPrefixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="GeeksforGeeks";
           String[] prefixes= {"Geeks","for","Gfor"};
           boolean b=matches(s,prefixes);
           if(b==true)
           {
        	   System.out.print("Given String starts with one of the  prefixes");
           }
           else
           {
        	   System.out.print("Given String do not starts with one of the  prefixes");
           }
	}
	public static boolean matches(String s,String[] prefixes)
	{
           for(int i=0;i<prefixes.length;i++)
           {
        	   if(s.startsWith(prefixes[i]))
        	   {
        		return true;
        	
        	   }
        	   
           }
           return false;
	}

}
