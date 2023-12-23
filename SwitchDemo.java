package javademo;

public class SwitchDemo {

	public static void main(String[] args) {
		int day = new java.util.Scanner(System.in).nextInt();
		int x = 5;
//		float f = 4;
		switch(day) {
		case 10-9:
			System.out.println("It's Monday.Concentrate on studies"); break;
		case 2,3,4:
			System.out.println("It's week day"); break;
		case 6,7:
			System.out.println("Enjoy the holiday");break;
		case 5:
			System.out.println("It's Friday. Get ready for week end"); break;
		default:
			System.out.println("Invalid day number");
		}
	}
}
