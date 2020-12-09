package com.abc.practice;

public class SwappingFirstAndLastCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks";
		char[] c = s.toCharArray();
		int n=s.length();
		char temp=' ';
		 temp=c[0];
		 c[0]=c[n-1];
		 c[n-1]=temp;
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(c[i]);
		 }
   	}

}
