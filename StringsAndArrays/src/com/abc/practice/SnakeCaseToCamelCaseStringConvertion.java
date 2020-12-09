package com.abc.practice;

public class SnakeCaseToCamelCaseStringConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="om namo narayana";
        
        char[] a = s.toCharArray();
        char[] b = s.toCharArray();
        int n=s.length();
        a[0]=(char) (a[0]-32);
        for(int i=1;i<n;i++)
        {
        	if(a[i]==' '&&a[i+1]!=' ')
        	{
        		a[i+1]= (char)(a[i+1]-32);
        	}
        	
        }
        int i=0;int m=0;
        while(i!=n)
        {
        	if(a[i]!=' ')
        	{
        	  b[m]=a[i];  			
        	  m++;
        	}
        	i++;
        }
        int spc=0;
        for(int e=0;e<n;e++)
        {
        	if(a[e]==' ')
        	{
        		spc++;
        	}
        }
        for(int j=0;j<n-spc;j++)
        {
        	System.out.print(b[j]);
        }
        
	}

}
