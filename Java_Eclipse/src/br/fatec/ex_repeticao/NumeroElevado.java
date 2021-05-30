package br.fatec.ex_repeticao;

import java.util.Scanner;

public class NumeroElevado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, k, p = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número e seu expoente: ");
		
		n = in.nextInt();
		k = in.nextInt();
		
		in.close();
		
		for (int i = 0; i < k; i++)
			p *= n;
		
		System.out.println("Potência: " + p);
		
	}

}
