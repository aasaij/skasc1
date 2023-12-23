package javademo;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		if ( n == 2)
			System.out.println("No");
		else if (n % 2 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
