package br.fatec.tiposprimimtivos;

import java.util.Scanner;

public class SalarioBonus {
	public static void main(String[] args) {
		String nom;
		double salFix = 0, totVen, valTot;
		
		/* salFix = Salário Fixo
		 * totVen = Total de venda
		 * valTot = Valor total dos 15% de comissão
		 * */
		
		Scanner in = new Scanner(System.in);
		
		totVen = in.nextDouble();
		valTot = .15 * totVen + salFix;
		
		System.out.printf("TOTAL = R$ %.2f\n", valTot);
		
	}
}
