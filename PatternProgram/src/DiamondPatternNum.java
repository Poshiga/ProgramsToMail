
public class DiamondPatternNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=8;
        for(int i=1;i<n;i++)
        {
        	for(int j=0;j<n-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=i;j>=1;j--)
        	{
        		System.out.print(j);
        	}
        	for(int j=2;j<=i;j++)
        	{
        		System.out.print(j);
        	}
        	System.out.println();
        }
        for(int i=n-2;i>=1;i--)
        {
        	for(int j=0;j<n-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=i;j>=1;j--)
        	{
        		System.out.print(j);
        	}
        	for(int j=2;j<=i;j++)
        	{
        		System.out.print(j);
        	}
        	System.out.println();
        	}
        }
	}


