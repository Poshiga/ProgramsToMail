import java.util.Scanner;

public class SandglassPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the n value");
         int n = sc.nextInt();
         for(int i=0;i<n;i++)
         {
        	 for(int j=0;j<=i;j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int j=0;j<n-i;j++)
        	 {
        		 System.out.print("*");
        	 }
        	 for(int j=1;j<n-i;j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         for(int i=0;i<n;i++)
         {
        	 for(int j=0;j<n-i;j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int j=0;j<=i;j++)
        	 {
        		 System.out.print("*");
        	 }
        	 for(int j=1;j<=i;j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         
        
	}

}
