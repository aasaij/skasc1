package javademo;

public class ArrayDemo {

	public static void main(String[] args) {
		  int[] arr;
//		  int []arr;
//		  int arr[];
		    arr = new int[5];
		    arr[0] = 100;
		    arr[1] = 200;
		    arr[3] = arr[0] + arr[1];
		    arr[2] = arr[3];
		    System.out.println(arr[3]);

	}

}
