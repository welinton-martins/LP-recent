package br.fatec.ex_repeticao;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i = 1;
		
		boolean tri = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		n = in.nextInt();
		
		in.close();
				
		while (i < n) {
			if (i * (i + 1) * (i + 2) == n) {
				System.out.println(n + " é triangular, pois " + i + " * " + (i + 1) + " * " + (i + 2) + " = " + n + ".");
				tri = true;
			}
			i += 3;
		}
		
		if (!tri)
			System.out.println(n + " não é triangular.");
	}

}
