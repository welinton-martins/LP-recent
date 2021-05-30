package br.fatec.exercicios;

import java.util.Scanner;

public class CondicaoEleitor{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade:");

        idade = in.nextInt();

        in.close();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        }
        else if (idade < 18 || idade >= 65) {
            System.out.println("Facultativo.");
        }
        else {
            System.out.println("Obrigatório");
        }

    }

}