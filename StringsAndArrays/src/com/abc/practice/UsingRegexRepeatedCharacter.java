package com.abc.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingRegexRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String s="omnamonarayana";
             char c='a';
             /*matchCount(s,c);
	}
	public static void matchCount(String s,char c)
	{
               Pattern p = Pattern.compile(String.valueOf(c));
                Matcher m = p.matcher(s);
               int i=0;
               while(m.find())
               {
            	   i++;
               }
              System.out.println("'a' in a string repeated for"+" "+i+" "+"times");
	}*/
             
             
             //normal method to solve
             int count=0;
             for(int i=0;i<s.length();i++)
             {
            	 if(s.charAt(i)==c)
            	 {
            		 count++;
            	 }
             }
             System.out.println("'a' in a string repeated for"+" "+count+" "+"times");
	}
}
