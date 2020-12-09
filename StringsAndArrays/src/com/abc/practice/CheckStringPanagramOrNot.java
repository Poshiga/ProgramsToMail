package com.abc.practice;

public class CheckStringPanagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="omnamonarayana";
       s=s.replace(" ","");
       String su = s.toUpperCase();
       char[] a = su.toCharArray();
       int n=s.length();
       int i=0;
       int [] res= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
       while(i!=n)
       {
    	   int index=a[i]-65;
    	   res[index]=1;
    	   i++;
       }
       i=0;
       while(i!=26)
       {
    	   if(res[i]==1)
    	   {
    		   i++;
    	   }
    	   else
    	   {
    		   System.out.println("Not an panagram");
    		   System.exit(0);
    	   }
       }
       System.out.println("Panagram");
	}

}
