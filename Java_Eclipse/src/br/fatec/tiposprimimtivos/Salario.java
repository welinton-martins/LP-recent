package br.fatec.tiposprimimtivos;

import java.io.IOException;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int hor = in.nextInt();
		double val = in.nextDouble();
		
		double sal = hor * val;
		
		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f\n", sal);
	}

}
