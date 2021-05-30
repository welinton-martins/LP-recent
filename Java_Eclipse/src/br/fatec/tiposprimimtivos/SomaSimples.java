package br.fatec.tiposprimimtivos;

import java.util.Scanner;

public class SomaSimples {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("SOMA = " + (a + b));
		in.close();
	}
}
