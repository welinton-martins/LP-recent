import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 65;
		char c = (char) i;
		double d = 39.7;
		int x = (int) d;
		long y = 10;
		x = (int) y;
		float z = 2.5f;
		/*
		byte n1 = 40, n2 = 50, n3;
		n3 = (byte) (n1 * n2);
		byte n4 = 50;
		n4 = (byte) (n4 * 2);*/
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		z = in.nextFloat();
		d = in.nextDouble();
		
		System.out.println("i: " + i);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("x: " + x);
	}

}
