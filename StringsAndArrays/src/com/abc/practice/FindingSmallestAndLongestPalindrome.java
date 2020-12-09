package com.abc.practice;

import java.util.Scanner;

public class FindingSmallestAndLongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the string:");
          String string = sc.nextLine();
          System.out.println("OriginalString:"+" "+string);
          String str="";
           
          //reversing the string
         for(int j=string.length()-1;j>=0;j--)
           {
        		 str=str+string.charAt(j);
           }
          System.out.println("ReverseString:"+" "+str);
           int count=0;
         for(int i=0;i<str.length();i++)
         {
        	 if(str.charAt(i)==' ')
        	 {
        		 count++;
        	 }
        	 
         }
         System.out.println("Space count:"+" "+count);
         int wc = count+1;
         System.out.println("Word count:"+" "+wc);
          
          //spliting words in a sentence original string
          String n[] = new String[wc];
          String tem =""; int j=0;
          for(int i=0;i<string.length();i++)
          {
        	  if(string.charAt(i)!=' ')
        	  {
        		  tem=tem+string.charAt(i);
        	  }
        	  else if(string.charAt(i)==' '&&string.charAt(i+1)!=' ')
        	  {
        		  tem=tem+tem.length();
        		  n[j] =tem;
        		  j++;
        		  tem="";
        	  }
          }
          tem=tem+tem.length();
          n[j]=tem;
          for(int i=0;i<n.length;i++)
          {
        	  System.out.print(n[i]);
          }
          System.out.println();
          
          //reverse string
          String m[] = new String[wc];
          String temp =""; int k=0;
          for(int i=0;i<str.length();i++)
          {
        	  if(str.charAt(i)!=' ')
        	  {
        		  temp=temp+str.charAt(i);
        	  }
        	  else if(str.charAt(i)==' '&&str.charAt(i+1)!=' ')
        	  {
        		  temp=temp+temp.length();
        		  m[k] =temp;
        		  k++;
        		  temp="";
        	  }
          }
          temp=temp+temp.length();
          m[k]=temp;
          for(int i=0;i<m.length;i++)
          {
        	  System.out.print(m[i]);
          }
          System.out.println();
          //comparison
          int c=0;
          for(int i=0;i<m.length;i++)
          {
        	  for(int d=0;d<n.length;d++)
        	  {
                
              }
	       }
          if(c>0)
          {
        	  System.out.println("Its a palindrome");
          }
          else
          {
        	  System.out.println("not a palindrome");
          }
}
}