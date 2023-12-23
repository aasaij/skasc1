package javademo;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int oldT=-1, preT=1, newT;
		for (int i=1; i<=n; i++) {
			newT = preT + oldT;
			System.out.println(newT);
			oldT = preT;
			preT = newT;
		}

	}

}
