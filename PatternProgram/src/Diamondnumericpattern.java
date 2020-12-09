
public class Diamondnumericpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=5;
           for(int i=1;i<n;i++)
           {
        	   for(int j=0;j<=i;j++)
        	   {
        		   System.out.print(" ");
        	   }
        	   for(int j=i;j<=n;j++)
        	   {
        		   System.out.print(j+" ");
        	   }
        	   System.out.println();
           }
           for(int i=n;i>=1;i--)
           {
        	   for(int j=0;j<=i;j++)
        	   {
        		   System.out.print(" ");
        	   }
        	   for(int j=i;j<=n;j++)
        	   {
        		   System.out.print(j+" ");
        	   }
        	   System.out.println();
           }
   }

}
