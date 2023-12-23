package javademo;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int arr[], size,max;
		size = in.nextInt();
		arr = new int[size];
		for (int i = 0;i<size; i++)
			arr[i] = in.nextInt();
		//finding highest value from an array
		max = arr[0];
		for(int i =1; i<size;i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println(max);
		
		

	}

}
