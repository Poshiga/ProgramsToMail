
public class NormalAndReverseOrderShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5; int count=0;
        for(int i=1;i<=n;i++)
        {
        	if(i%2==0)
        	{
        		count=i*(i+1)/2;
        		for(int j=1;j<=i;j++)
        		{
        			System.out.print(count-j+1+" ");
        		}
        	}
        	else
        	{
        		count=count+1;
        		for(int j=1;j<=i;j++)
        		{
        			System.out.print(count+" ");
        			count++;
        		}
        	}
        	System.out.println();
        }
		
	}

}
