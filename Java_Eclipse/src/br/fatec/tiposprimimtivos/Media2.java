package br.fatec.tiposprimimtivos;

import java.io.IOException;
import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		double media = (a * 2 + b * 3 + c * 5) / 10;
		
		System.out.printf("MEDIA = %.1f\n", media);
	}
}
