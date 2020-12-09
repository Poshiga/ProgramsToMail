
public class TrapeziumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=4;int count=1;
             for(int i=0;i<n;i++)
             {
            	 for(int j=0;j<=i;j++)
            	 {
            		 System.out.print(" ");
            	 }
            	 for(int j=0;j<n-i;j++)
            	 {
            		 System.out.print(count+"*");
            		 count=count+1;
            	 }
            	 count=(n*n)+1;   int k =n-1;
                 for(int j=0;j<n-i;j++)
                 {
                	 System.out.print(count+j);
                	 
                	 if(j<n-i-1)
                	 {
                		 System.out.print("*");
                	 }
                 }
            System.out.println();
             }
                      
	}

}
