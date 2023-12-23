package javademo;

import java.util.Scanner;

public class SecondMinimum {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int arr[], size,min, smin;
		size = in.nextInt();
		arr = new int[size];
		for (int i = 0;i<size; i++)
			arr[i] = in.nextInt();
		min = Math.min(arr[0], arr[1]);
		smin = Math.max(arr[0], arr[1]);
		for(int i = 2;  i<size; i++) {
			if (min > arr[i]) {
				smin = min;
				min = arr[i];
			}
			else if (smin > arr[i])
				smin = arr[i];
		}
		System.out.println(smin);
	}

}
