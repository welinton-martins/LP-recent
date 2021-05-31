package br.fatec.ex_repeticao;

import java.util.Scanner;

public class ParesMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int num = in.nextInt();
		
		in.close();
		
		for (int i = 2; i < num; i+=2) {
			System.out.println(i);
		}
		
		
	}

}
