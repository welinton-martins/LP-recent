package br.fatec.exercicios;

import java.util.Scanner;

public class DiaDaSemana {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int dia = in.nextInt();
       
       in.close();
       
       String diaDaSemana;

       switch (dia) {
           case 1:
        	   diaDaSemana = "Domingo";
        	   break;
           case 2:
        	   diaDaSemana = "Segunda-feira";
        	   break;
           case 3:
        	   diaDaSemana = "Terca-feira";
        	   break;
           case 4:
        	   diaDaSemana = "Quarta-feira";
        	   break;
           case 5:
        	   diaDaSemana = "Quinta-feira";
        	   break;
           case 6:
        	   diaDaSemana = "Sexta-feira";
        	   break;
           case 7:
        	   diaDaSemana = "Sabado";
        	   break;
           default:
        	   diaDaSemana = "Invalido";
        	   break;
       }
       
       System.out.println("Dia da semana: " + diaDaSemana);
   }
}
