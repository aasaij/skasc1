package javademo;
//5
//1234554321	5
//1234  4321	4
//123    321	3
//12      21	2
//1        1	1
//12      21	2
//123    321	3
//1234  4321	4
//1234554321	5
public class DiamondPattern {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int r = n; r>=1; r--) {
			for(int c = 1; c<=r;c++)
//				System.out.print(c);
				System.out.print("*");
			//printing space
			for (int c=1; c<=n*2-(r*2); c++)
				System.out.print(" ");
			for(int c = r; c>=1;c--)
//				System.out.print(c);
				System.out.print("*");				
			
			System.out.println();
		}		
		for (int r = 1; r<=n; r++) {
			for(int c = 1; c<=r;c++)
//				System.out.print(c);
				System.out.print("*");				
			//printing space
			for (int c=1; c<=n*2-(r*2); c++)
				System.out.print(" ");
			for(int c = r; c>=1;c--)
//				System.out.print(c);
				System.out.print("*");			
			System.out.println();
		}
	}
}
