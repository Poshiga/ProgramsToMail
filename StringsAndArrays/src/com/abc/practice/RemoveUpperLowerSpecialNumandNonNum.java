package com.abc.practice;

public class RemoveUpperLowerSpecialNumandNonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="ASAGfhrfg23690!$~^&";
           int n=s.length();
           String wou="";
           String woul="";
           String won="";
           String wos="";
           String wonn="";
           for(int i=0;i<n;i++)
           { 
        	   if(!(s.charAt(i)>=65 && s.charAt(i)<=90))
        	   {
        		  wou=wou+s.charAt(i); 
        	   }
        	   if(!(s.charAt(i)>=97 && s.charAt(i)<=122))
        	   {
        		   woul=woul+s.charAt(i);
        	   }
        	   if(!(s.charAt(i)>=48 && s.charAt(i)<=57))
        	   {
        		   won=won+s.charAt(i);
        	   }
        	   if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 ||s.charAt(i)>=48 && s.charAt(i)<=57)
        	   {
        		   wos=wos+s.charAt(i);
        	   }
        	   if(s.charAt(i)>=48 && s.charAt(i)<=57)
        	   {
        		   wonn=wonn+s.charAt(i);
        	   }
        	   
           }
           System.out.println("After removing uppercase from the string:"+" "+wou);
           System.out.println("After removing lowercase from the string:"+" "+woul);
           System.out.println("After removing numericvalues from the string:"+" "+won);
           System.out.println("After removing special char from the string:"+" "+wos);
           System.out.println("After removing non-numeric from the string:"+" "+wonn);
	}

}
