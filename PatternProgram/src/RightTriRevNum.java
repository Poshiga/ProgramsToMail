
public class RightTriRevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5; 
        for(int i=1;i<=n;i++)
        {
        	int count=i*(i+1)/2;
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(count+" ");
        		count--;
        	}
        	System.out.println();
        }
	}

}
