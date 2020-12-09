package com.abc.practice;

public class PrintEvenLengthWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="This is my class";
           int n=s.length();
           //String[] str = s.split(" ");
           char[] a = s.toCharArray();
           int len = a.length;
           int sp=0;
           for(int i=0;i<s.length();i++)
           {
        	   if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
        	   {
        		    sp++;
        	   }
           }
           int wc=sp+1;
           System.out.println("word count:"+" "+wc);
           String[] s1 = new String[wc];
           String tem="";
           int j=0;
           for(int i=0;i<a.length;i++)
           {
        	    if(a[i]!=' ')
        	    {
        	    	tem=tem+a[i];
        	    }
        	    else if(a[i]==' '&&a[i+1]!=' ')
        	    {
        	    	s1[j]=tem;
        	    	j++;
        	    	tem="";
        	    }
           }
           s1[s1.length-1]=tem;
           for(int k=0;k<s1.length;k++)
           {
        	   if(s1[k].length()%2==0)
        	   {
        		   System.out.println(s1[k]);
        	   }
           }
           
           /*for(int i=0;i<str.length;i++)
           {
        	   if(str[i].length()%2==0)
        	   {
        		   System.out.println(str[i]);
        	   }
           }*/
           
	}

}
