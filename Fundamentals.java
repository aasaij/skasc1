package javademo;

public class Fundamentals {

	public static void main(String[] args) {
		int x = 10, y, z;
		y = x++;
		z = ++x+ y++;
//		System.out.println(x +","+ y + "," +z);
//		System.out.print(x +","+ y + "," +z);
		System.out.printf("%d %d %d\n", x , y ,z);
	}

}
