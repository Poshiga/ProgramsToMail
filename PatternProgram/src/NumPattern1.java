
public class NumPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=4; 
        for(int i=1;i<=n;i++)
        { 
        	int count=i;
        	for(int j=1;j<=n;j++)
        	{
        		System.out.print(count+" ");
        		count=count+n;
            }
        	System.out.println();
        }
	}

}
