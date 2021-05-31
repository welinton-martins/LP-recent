package br.fatec.decisão;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b, maior;
		System.out.print("Digite 2 numeros inteiros diferentes: ");
		a = in.nextInt();
		b = in.nextInt();
		if (a > b) {
			maior = a;
		}
		else {
			maior = b;
		}
		
		System.out.println("Maior = " + maior);
	}

}
