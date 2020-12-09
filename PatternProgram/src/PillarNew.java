
public class PillarNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=9;
          for(int i=1;i<=n;i++)
          {
        	 if(i%2==1)
        	 {
        	  for(int j=1;j<=n;j++)
        	  {
        		  if(j%n==0)
        		  {
        		  System.out.print(i+1);
        		  }
        		  else
        		  {
        			  System.out.print(i);
        		  }
        	  }
        	 }
        	 else if(i%2==0)
        	 {
        		 for(int j=1;j<=n;j++)
        		 {
        			 if(j==1)
        			 {
        				 System.out.print(i+1);
        			 }
        			 else
        			 {
        				 System.out.print(i);
        			 }
        		 }
        	 }
        	 System.out.println();
          }
        	
          }
	}


