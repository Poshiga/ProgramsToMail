package com.abc.practice;

public class StringContainsOnlyDigitsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="";
		String s="1234abchjxb";
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				s1=s1+s.charAt(i);
			}
		}
		if(s1.equals(s))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
