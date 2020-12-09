
public class NewPatternNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=10;int count=1;
            for(int i=1;i<=n;i++)
            {
            	if(i%2!=0)
            	{
                  for(int j=1;j<=i;j++)
            	  {
                     if(j%2!=0)
                     {
                    	 System.out.print(j*j+" ");
                     }
            	  }
            	   }
            	System.out.println();
	}
            for(int i=1;i<=n;i++)
            {
            	if(i%2==1)
            	{
            	for(int j=1;j<n-i;j++)
            	{
            		if(j%2==1)
            		{
            			System.out.print(j*j+" ");
            		}
            	}
            }
            System.out.println();
            }

}
}