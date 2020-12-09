package com.abc.practice;

public class UppercaseAtTheEndOfTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String s="Hello India";
		int n = s.length();
		String str="";String str1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
		        str=str+s.charAt(i);
			}
			else
			{
				str1=str1+s.charAt(i);
			}
		}
		String str2=str1+str;
		System.out.println(str2);
	}

}
