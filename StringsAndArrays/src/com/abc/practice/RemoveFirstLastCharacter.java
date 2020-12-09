package com.abc.practice;

public class RemoveFirstLastCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="geeksforgeeks";
        int n = s.length();
        for(int i=1;i<n-1;i++)
        {
        	System.out.print(s.charAt(i));
        }
	}

}
