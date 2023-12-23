package javademo;

import java.util.Scanner;

//Jeeva
//J
//Je
//Jee
//Jeev
//Jeeva
public class StringPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String str = in.next();  //nextLine()
		String str = in.nextLine();
		int n = str.length();
		for (int i = n; i>=1;i--)
			System.out.printf("%-"+n+"."+i+"s%"+n+"."+i+"s\n",str,str );
		
		for (int i = 1; i<=n;i++)
			System.out.printf("%-"+n+"."+i+"s%"+n+"."+i+"s\n",str,str );
		
		
//		System.out.printf("%10.1s\n", str);
//		System.out.printf("%10.2s\n", str);
//		System.out.printf("%10.3s\n", str);
//		System.out.printf("%10.4s\n", str);
//		System.out.printf("%10.5s\n", str);
//		System.out.printf("%10.6s\n", str);
//		System.out.printf("%10.7s\n", str);
//		System.out.printf("%10.8s\n", str);
//		System.out.printf("%10.9s\n", str);
//		System.out.printf("%10.10s\n", str);
		
//		System.out.printf("%7d\n", 12345);
//		System.out.printf("%7d\n", 12);
//		System.out.printf("%7d\n", 123);
//		System.out.printf("%7d\n", 1234578);
//		System.out.printf("%7d\n", 123457834);
		

	}

}
