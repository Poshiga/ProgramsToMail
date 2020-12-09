
public class SpiralIncNumPattern
{
       static int r=0, c=0;
       static int count=1;
       static int n=4;
       static int[][]a=new int[n][n];
       
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         while(count<=n*n)
         {
        	 right();
        	 down();
        	 left();
        	 up();
         }
         for(int i=0;i<n;i++)
         {
        	 for(int j=0;j<n;j++)
        	 {
        		 if(a[i][j]<10)
        		 {
        		 System.out.print("0"+a[i][j]+" ");
        		 }
        		 else
        		 {
        			 System.out.print(a[i][j]+" ");
        		 }
        	 }
        	 System.out.println();
         }
	}
	public static void right()
	{
		if(c>=n||a[r][c]!=0)
		{
			c--;
			r++;
			return;
		}
		else
		{
			a[r][c]=count;
			++count;
			c++;
			right();
		}
	}
	public static void down()
	{
		if(r>=n||a[r][c]!=0)
		{
			r--;
			c--;
			return;
		}
		else
		{
			a[r][c]=count;
			++count;
			r++;
			down();
		}
	}
	public static void left()
	{
		if(c<0||a[r][c]!=0)
		{
			r--;
			c++;
			return;
		}
		else
		{
			a[r][c]=count;
			++count;
			c--;
			left();
		}
	}
	public static void up()
	{
		if(r<0||a[r][c]!=0)
		{
			r++;
			c++;
			return;
		}
		else
		{
			a[r][c]=count;
			++count;
			r--;
			up();
		}
	}

}
