package com.abc.practice;

public class OptimizeConcatinationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*String s1 ="ItsCodingEra";
         String s2 ="2020India";
         String s3 = s1+s2 ;
         System.out.println(s3);*/
		
		/*String s1 = new String("ItsCodingEra");
		String s2 = new String("2020India");
		String s3 = s1.concat(s2);
		System.out.print(s3);*/
		
		//using '+' operator
		String str="";
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			str=str+Integer.toString(0);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("TimeTaken to concate 10000 string using '+' operator:"+" "+(endTime-startTime)+" "+"ms");
		
		//using 'concat' inbuilt method
		/*String str="";
		long startTime=System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			str=str.concat(Integer.toString(0));
		}
		long endTime=System.currentTimeMillis();
		System.out.println("TimeTaken to concate 10000 string using 'concat' inbuilt method:"+" "+(endTime-startTime)+" "+"ms");*/
		
		//using 'stringBuilder'class
		 /* StringBuilder sb = new StringBuilder();
		  long startTime=System.currentTimeMillis();
		  for(int i=0;i<10000;i++)
		  {
			  sb.append(i);
		  }
		  long endTime=System.currentTimeMillis();
		  System.out.println("TimeTaken to concate 10000 string using 'StringBuilder'class :"+" "+(endTime-startTime)+" "+"ms");*/
		  
		  //using 'StringBuffer' class
		 /* StringBuffer sb = new StringBuffer();
		  long startTime=System.currentTimeMillis();
		  for(int i=0;i<100000;i++)
		  {
			  sb.append(0);
		  }
		  long endTime=System.currentTimeMillis();
		  System.out.println("TimeTaken to concate 10000 string using 'StringBuffer'class :"+" "+(endTime-startTime)+" "+"ms");*/
	 
	}

}
