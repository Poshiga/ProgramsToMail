
public class SandglassPatternNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        for(int i=0;i<n;i++)
        {
        	for(int j=1;j<=n-i;j++)
        	{
        		System.out.print(j);
        	}
        	System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(j);
        	}
        	System.out.println();
        }
	}

}
