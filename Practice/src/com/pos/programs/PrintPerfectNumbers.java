package com.pos.programs;

public class PrintPerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  s=0;
          for(int i=3;i<1000;i++)
          {
        	  for(int j=1;j<i;j++)
        	  {
        		  if(i%j==0)
        		  {
        			  s=s+j;
        		  }
        		  if(s==i)
            	  {
            		  System.out.println("i"+"="+i);
            		  System.out.println("s"+"="+s);
            		  System.out.println("PerfectNumber");
            	  }
        	  }
        	  
          }
	}

}
