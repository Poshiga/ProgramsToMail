package com.pos.programs;

public class kaprekarNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;int  res=0;
		for(int i=1;i<1000;i++)
		{
			a=i*i;
			while(a<0)
			{
		    a=a%10;
		    res = res+a;
		    System.out.println(res);
			}
		}
	}

}
