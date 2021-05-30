package br.fatec.ex_repeticao;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        
        n = in.nextInt();

        for(int i = 2 * n - 1; i > 0; i -= 2) {
            System.out.printf("%02\n",i);
        }



    } 
}
