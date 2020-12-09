package com.abc.practice;

public class SubStringwithoutInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "Om namo";
         char[] c = s.toCharArray();
         int n=c.length;
         int n1=n;
        for(int i=0;i<n;i++)
        {
        	int n2=n;
        	for(int j=0;j<n1;j++)
        	{
        		for(int k=i;k<n2;k++)
        		{
        			System.out.print(c[k]);
        		}
        		System.out.println();
        		n2--;
        	}
        	n1--;
        	
        }
         
	}

}
