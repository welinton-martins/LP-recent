// Author: Welinton

package br.fatec.exercicios;

import java.util.Scanner;

public class ValorDoCredito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float saldoMedio, valorCredito = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o saldo medio de um cliente: ");
		
		saldoMedio = in.nextFloat();
		
		in.close();
		
		if (saldoMedio > 5000) {
			valorCredito = (float) (saldoMedio * 2);
		}
		else if (saldoMedio <= 5000 && saldoMedio > 3000)  {
			valorCredito = (float) (saldoMedio * 1.5);
		}
		else if (saldoMedio <= 3000 && saldoMedio > 1000) {
			valorCredito = saldoMedio;
		}
		else if (saldoMedio <= 1000 && saldoMedio > 0){
			valorCredito = (float) (saldoMedio * .75);
		}
		else {
			System.out.println("Número invalido!");
		}
		
		System.out.printf("Valor do crédito: %.2f", valorCredito);
		
	}

}
