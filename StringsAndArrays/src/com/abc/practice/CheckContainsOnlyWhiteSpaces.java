package com.abc.practice;

public class CheckContainsOnlyWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s="	         	";
            String s1="om namo narayana";
            System.out.print("String contains only whitespaces:");
        	s1=s1.trim();
        	if(s1.isEmpty()==true)
        	{
        		System.out.println("yes");
        	}
        	else
        	{
        		System.out.println("no");
        	}
	}

}
