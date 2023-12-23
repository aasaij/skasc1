package javademo;

public class ReversingNumber {

	public static void main(String[] args) {
		long sum = 0,n = new java.util.Scanner(System.in).nextLong();
		while(n !=0) {
			long remainder = n % 10;
			sum = sum * 10 + remainder;
			n = n / 10 ;// n/=10
		}
//		System.out.println(sum);
//		hackerrank.com
//		leetcode.com
//		codechef.com
//		geeksforgeeks.org
	}

}
