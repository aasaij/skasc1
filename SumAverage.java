package javademo;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b, c, sum;
		float avg;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		sum = a + b + c;
		avg = sum / 3.0f;
		System.out.println("Sum : " + sum + "\nAverage : "+avg);
	}
}
