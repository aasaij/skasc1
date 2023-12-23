package javademo;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		//Method 1
//		for(int i = 2; i<=n-1; i++) {
//			if ( n % i == 0) {
//				System.out.println("Not Prime");
//				return; //terminate  main()
//			}
//		}
		if (n > 3 && (n% 2 == 0 || n % 3 == 0))
			System.out.println("Not Prime");
		else {
			for(int i = 5; i<=Math.sqrt(n); i+=6) {
				if ( n % i == 0 || n % (i+2)==0) {
					System.out.println("Not prime");
					return;
				}
			}
			System.out.println("Prime");
		}
	}
}
//
//2 3  5 7   11 13   17 19   23   29 31    37 
//twin prime numbers





