
public class DescendingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=5;int count=n*(n+1)/2;
          for(int i=0;i<=n;i++)
          {
        	  for(int j=1;j<=n-i;j++)
        	  {
        		  System.out.print(count+" ");
        		  count--;
        	  }
        	  System.out.println();
          }
	}

}
