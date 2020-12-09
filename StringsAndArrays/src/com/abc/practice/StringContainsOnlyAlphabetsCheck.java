package com.abc.practice;

public class StringContainsOnlyAlphabetsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s ="omnamonarayana2020";
            System.out.print("String contains only Alphabets:"+" ");
            int n  =s.length();
            String s1="";
       //     boolean res=isCharacter(s);
         //   System.out.println(res);
           for(int i=0;i<n;i++)
            {
            	if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
            	{
            		s1=s1+s.charAt(i);
            	}
            }
           if(s==null||s.isEmpty()==true)
           {
           	System.out.println("false");
           }
            
           else if(s1.equals(s))
            {
              System.out.println("true");
            }            
            else 
            {
            	System.out.println("false");
            }
	}
	//using inbuilt method
/*   public static boolean isCharacter(String s)
    {
	   if(s==null||s.isEmpty()==true)
       {
       	return false;
       }
       
       for(int j=0;j<s.length();j++)
       {
          if(!(Character.isLetter(s.charAt(j))))
          {
    	      return false;
          }
           
       }
       return true; 
    }*/
    

}
