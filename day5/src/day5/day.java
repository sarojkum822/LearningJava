package day5;

public class day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k;
		int n=5;
		for(i=1;i<=5;i++){
			for(k=1;k<=n-i;k++) {
				System.out.println(" ");
			}
			for(j=1;j<=i;j++) 
			{
				if(i==n||j==1||i==j) {
					System.out.print("*");

				}else {
				System.out.print("-");
				}
			}
			System.out.println("");

		}
	}

}
