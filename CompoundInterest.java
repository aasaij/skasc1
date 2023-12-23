package javademo;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int principal;
		float rate, years, interest;
		System.out.print("Principal Amount : ");
		principal = in.nextInt();
		System.out.print("Rate of interest : ");
		rate = in.nextFloat();
		System.out.print("Number of years : ");
		years = in.nextFloat();
		interest = principal *(float) Math.pow(1+rate/100, years);
		System.out.printf("Interest : %.2f ",  interest);
	}

}
