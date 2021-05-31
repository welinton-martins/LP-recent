package br.fatec.exercicios;

import java.util.Scanner;

public class ordemDecrescente {
   public static void main(String[] args) {
       int num1, num2;

       Scanner in = new Scanner(System.in);

       System.out.println("Digite dois números inteiros diferentes:");

       num1 = in.nextInt();
       num2 = in.nextInt();

       if (num1 > num2) {
           System.out.printf("%d%n%d",num1,num2);
       }
       else {
           System.out.printf("%d%n%d",num2,num1);
       }
   } 
}
