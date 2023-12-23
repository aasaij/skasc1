package javademo;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[], size, key;
		size = in.nextInt();
		arr = new int[size];
		//getting list of values from the user
		for(int i = 0;i<size;i++)///////////
			arr[i] = in.nextInt();
		key = in.nextInt();
		//implementing linear search algorithm
		for (int i = 0; i<size; i++) {
			if (arr[i]==key) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not found");
	}

}
