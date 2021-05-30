package br.fatec.exercicios;

import java.util.Scanner;

public class FormatandoData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int data, dia, mes, ano;
		
		String nomeMes = "";
		
		System.out.print("Digite uma data no formato ddmmaaaa: ");
		
		data = in.nextInt();
		
		in.close();
		
		dia = data / 1000000;
		
		mes = data / 10000;
		
		mes = mes % 100;
		
		ano = data % 10000; 
		
		switch (mes) {
			case 1:
				nomeMes = "Janeiro";
				break;
			case 2:
				nomeMes = "Fevereiro";
				break;
			case 3:
				nomeMes = "Março";
				break;
			case 4:
				nomeMes = "Abril";
				break;
			case 5:
				nomeMes = "Maio";
				break;
			case 6:
				nomeMes = "Junho";
				break;
			case 7:
				nomeMes = "Julho";
				break;
			case 8:
				nomeMes = "Agosto";
				break;
			case 9:
				nomeMes = "Setembro";
				break;
			case 10:
				nomeMes = "Outubro";
				break;
			case 11:
				nomeMes = "Novembro";
				break;
			case 12:
				nomeMes = "Dezembro";
				break;
		}
		
		System.out.println(dia + " de " + nomeMes + " de " + ano);
		
	}
}
