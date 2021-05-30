package br.fatec.ex_repeticao;

import java.util.Scanner;

public class DiscosVendidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quant, maior = 0, dia = 0;
		
		String mes = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de discos vendidos");
		
		for (int i = 1; i <= 30; i++) {
			System.out.print(i + " dia: "); 
			
			quant = in.nextInt();
			
			if (quant > maior) {
				maior = quant;
				dia = i;
			}			
		}
		
		System.out.println("Dia da maior venda: " + dia + ", quantidade: " + maior);
		
	}

}
