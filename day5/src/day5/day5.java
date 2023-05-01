package day5;

public class day5 {
	public static void main(String[] args) {
		int i;
		int j;
		int n= 5;
		for(i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++) 
				{
				System.out.println(" ");
			}
			for(j=1;j<=i;j++) 
			{
				if(i==1||i==n||j==1||j==i) 
				{
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
