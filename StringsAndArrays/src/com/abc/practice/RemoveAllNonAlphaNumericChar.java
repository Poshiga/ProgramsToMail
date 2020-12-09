package com.abc.practice;

public class RemoveAllNonAlphaNumericChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="om namo narayana@#$$123";
         String s1="";
         int n = s.length();
         for(int i=0;i<n;i++)
         {
        	 if(!(s.charAt(i)>=32&&s.charAt(i)<=47||s.charAt(i)>=58&&s.charAt(i)<=64||s.charAt(i)>=91&&s.charAt(i)<=96||s.charAt(i)>=123&&s.charAt(i)<=126))
        	 {
        		 s1=s1+s.charAt(i);
        	 }
         }
         System.out.println(s1);
	}

}
