package com.abc.practice;

public class RemoveWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="omnamonarayana";
        int n=s.length();
        String s1="om"; 
        String s2="";
        if(s.contains(s1))
        {  
            s=s.replaceAll(s1,"");
        
        } 	
        
		System.out.println(s);
	}

}
