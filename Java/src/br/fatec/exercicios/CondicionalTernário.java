package br.fatec.exercicios;

import java.util.Scanner;

public class CondicionalTernário {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		
		char sexo;
		
		System.out.print("Por favor digite seu nome e sexo (M ou F): ");
		
		nome = in.nextLine();
		
		sexo = in.nextLine().charAt(0);

		in.close();

		String out = (sexo == 'F') ? "Muito obrigado, Sra. " + nome + "!" : "Muito obrigado, Sr. " + nome + "!";
		
		System.out.println(out);
		
		}
}
