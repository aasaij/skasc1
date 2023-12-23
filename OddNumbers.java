package javademo;
//Printing odd numbers up to N
public class OddNumbers {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		//Method 1
//		for(int i = 1; i<=n; i++) {
//			if ( i % 2 == 1)
//				System.out.println(i);
//		}
		//Method 2
//		for(int i = 1; i<=n; i+=2) {
//				System.out.println(i);
//		}
		//printing even numbers from N to 1
		for(int i = n%2==0?n:n-1; i>=1; i-=2) {
			System.out.println(i);
	}


	}
}
