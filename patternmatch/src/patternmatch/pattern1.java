package patternmatch;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {

		int n;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("1.pyramid 2. Rect");
		int type = sc.nextInt();
		if(type==1)
			printPyramid(n);
		else
			printRectangle(n);
	}
	public static void printPyramid(int n){		// TODO Auto-generated method stub
		int i;
		int j;
		for(i=0;i<=n-1;i++) {
			for(j=0;j<=n-1;j++){
				if(j<=i)
				{
					System.out.print("*");
					}
				else {
					System.out.print("-");
				}
			}

			System.out.println(" ");
		}
		System.out.println(" ");
	}
	public static void printRectangle(int n){		// TODO Auto-generated method stub
		int i;
		int j;
		for(i=0;i<=n-1;i++) {
			for(j=0;j<=n-1;j++){
				if(i == 0 || i==n-1 || j == 0 || j  == n-1)
				{
					System.out.print("*");
					}
				else {
					System.out.print("-");
				}
			}

			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
