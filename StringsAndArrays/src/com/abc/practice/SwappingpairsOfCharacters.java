package com.abc.practice;

public class SwappingpairsOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="geeksforgeeks";
         //String s="java";
         char[] a = s.toCharArray();
         int n=s.length();
         if(n%2!=0)
         {
         for(int i=0;i<a.length-1;i++)
         {
        	char temp=a[i];
        	 a[i]=a[i+1];
        	 a[i+1]=temp;
             i++;  	 
         }
         for(int j=0;j<n;j++)
         {
         System.out.print(a[j]);
         }
	}
         else
         {
        	 for(int i=0;i<a.length-2;i++)
             {
            	char temp=a[i];
            	 a[i]=a[i+1];
            	 a[i+1]=temp;
                 i++;  	 
             }
             for(int j=0;j<n;j++)
             {
             System.out.print(a[j]);
             }
         }
	}

}
