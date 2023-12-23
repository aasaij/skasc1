package javademo;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		if ( n > 0)
			System.out.println("Positive");
		else if (n < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}

}
