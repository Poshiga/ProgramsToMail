
public class BinaryNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
         for(int i=0;i<n;i++)
         { 
        	 if(i%2==0)
           {
        	for(int j=0;j<n;j++)
        	{
        	 if(j%2==0)
        	 {
                System.out.print("1");
             }	     
        	 else if(j%2==1)
        	 {
        		 System.out.print("0");
             }
        	 
        	}
        	System.out.println();
	       }
            else  if(i%2==1)
            {
        	    for(int j=0;j<n;j++)
         	    {
         	      if(j%2==0)
         	      {
                     System.out.print("0");
              }	     
         	 else if(j%2==1)
         	 {
         		 System.out.print("1");
              }
         	 
         	}
         	System.out.println();
 	   }
         }
         
	}
}
