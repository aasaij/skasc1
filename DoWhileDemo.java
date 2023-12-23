package javademo;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char confirm=' ';
		do {
			int n = in.nextInt();
			if (n % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
			System.out.print("Want to continue [Y/N] ?");
			confirm = in.next().charAt(0);
		}while(confirm == 'Y' || confirm =='y');
	}

}
