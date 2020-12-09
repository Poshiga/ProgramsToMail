
public class DiamondPatternAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=9; int alpha=65;
           for(int i=0;i<n;i++)
           {
        	   for(int j=0;j<n;j++)
        	   {
        		   if(i+j==n/2||j-i==n/2)
        		   {
        			   System.out.print((char)(alpha+i));
        		   }
        		   else
        		   {
        			   System.out.print(" ");
        		   }
        	   }
        	   System.out.println();
           }
           for(int i=n-1;i>0;i--)
           {
        	   for(int j=0;j<n;j++)
        	   {
        		   if(i+j==n+n/2-1||i-j==n/2)
        		   {
        			   System.out.print((char)(alpha+i));
        		   }
        		   else
        		   {
        			   System.out.print(" "); 
        		   }
        	   }
        	   System.out.println();
           }
	}

}
