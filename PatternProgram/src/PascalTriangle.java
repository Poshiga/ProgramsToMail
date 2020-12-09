
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;int count=1;
         for(int i=0;i<=n;i++)
         {
        	 for(int j=0;j<n-i;j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int j=0;j<=i;j++)
        	 {
        		 if(i==0||j==0)
        		 {
        		   System.out.print(count+" ");
        	     }
        		 else
        		 {
        			 count=count*(i-j+1)/j;
        			 System.out.print(count+" ");
        		 }
        	 }
        	 System.out.println();
	}

}
}