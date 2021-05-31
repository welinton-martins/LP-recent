package br.fatec.exercicios;

import java.util.Scanner;
//import java.io.IOException;

public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("Digite as duas notas da prova:");
		
		nota1 = in.nextDouble();
		nota2 = in.nextDouble();
		
		media = (nota1 + nota2) / 2; 
		
		if (media >= 6) {
			System.out.println("Aprovado.");
		}
		else {
			System.out.println("Reprovado.");
		}
		
		System.out.printf("Media = ", media);	
		
		in.close();
	}

}
