package com.abc.practice;

public class CheckStringContainOnlySpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "!#$%^&AJNSb";
         String str="";
         for(int i=0;i<s.length();i++)
         {
        	 if(s.charAt(i)>=32 && s.charAt(i)<=47 || s.charAt(i)>=58 && s.charAt(i)<=64 || s.charAt(i)>=91 && s.charAt(i)<=96|| s.charAt(i)>=123 && s.charAt(i)<=126)
        	 {
        		 str=str+s.charAt(i);
        	 }
         }
         System.out.print("String contains only special char:"+" ");
         //System.out.println("s"+"="+" "+s);
         //System.out.println("str"+"="+" "+str);
         if(s.equals(str))
         {
        	 System.out.println("yes");
         }
         else
         {
        	 System.out.println("no");
         }
	}

}
