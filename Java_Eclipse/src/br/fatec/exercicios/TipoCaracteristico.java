package br.fatec.exercicios;

import java.util.Scanner;

public class TipoCaracteristico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int D, M, A, Z;
		
		String N;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a dia de nascimento: ");
		
		D = in.nextInt();
		
		System.out.print("Digite o mês de nascimento: ");
		
		M = in.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		
		A = in.nextInt();
		
		N = "" + D + M + A;
		
		Z = Integer.parseInt(N) % 9;
		
		switch (Z) {
			case 0:
				System.out.println("irresistível");
				break;
			case 1:
				System.out.println("impetuoso");
				break;
			case 2:
				System.out.println("discreto");
				break;
			case 3:
				System.out.println("amoroso");
				break;
			case 4:
				System.out.println("tímido");
				break;
			case 5:
				System.out.println("paquerador");
				break;
			case 6:
				System.out.println("estudioso");
				break;
			case 7:
				System.out.println("sonhador");
				break;
			case 8:
				System.out.println("charmoso");
				break;
		}
	}

}
