package javademo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[], size, key, lb, ub, mid;
		size = in.nextInt();
		arr = new int[size];
		for (int i = 0; i<size; i++) {
			arr[i]=in.nextInt();
		}
		key = in.nextInt();
		Arrays.sort(arr);
		//implementing binary search algorithm
		lb = 0; 
		ub = size-1;
		while(lb<=ub) {
			mid = (lb + ub) / 2;
			if (arr[mid] == key) {
				System.out.println("Found");
				return;
			}
			else if (arr[mid]>key)
				ub = mid - 1;
			else 
				lb = mid + 1;
		}
		System.out.println("Not found");
		
	}

}
