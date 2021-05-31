package br.fatec.exerciciosRepeticao;

import java.util.Scanner;

public class NumeroAoQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite 10 números: ");
		
		for (int i = 0; i < 10; i++) {
			n = in.nextInt();
			
			System.out.printf("%.0f%n",Math.pow(n, 2));
		}
		
		in.close();
	}

}
