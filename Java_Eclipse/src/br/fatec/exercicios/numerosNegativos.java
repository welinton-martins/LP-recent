package br.fatec.exercicios;

import java.util.Scanner;

public class numerosNegativos {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, num3, numNeg = 0; // numNeg: quantidade de números negativos

        System.out.print("Digite 3 números inteiros: ");

        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        in.close();

        if (num1 < 0) {
            numNeg++;
        }

        if (num2 < 0) {
            numNeg++;
        }

        if (num3 < 0) {
            numNeg++;
        }

        System.out.printf("Tem %d número(s) negativo(s).", numNeg);
   }

}
