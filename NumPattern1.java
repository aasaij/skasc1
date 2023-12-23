package javademo;
//5
//12345	5
//1234	4
//123		3
//12		2
//1		1
public class NumPattern1 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int i = n; i>=1; i--) { // rows
			for (int j = 1; j<=i; j++) //columns
				System.out.print((char)(j+64));
			System.out.println();
		}

	}

}
