package br.fatec.exercicios;

import java.util.Scanner;

public class ValorDaParcela {
    public static void main(String[] args) {
        double salarioBruto, valorEmprestimo, numeroParcelas, valorParcela, valorMaximo;

        boolean concederEmprestimo;

        Scanner in= new Scanner(System.in);

        System.out.print("Digite o salario bruto, o valor do empréstimo e o número de parcelas: ");

        salarioBruto = in.nextDouble();

        valorEmprestimo = in.nextDouble();

        numeroParcelas = in.nextDouble();

        in.close();

        if (valorEmprestimo <= salarioBruto * .3)
            concederEmprestimo = true;
        else
            concederEmprestimo = false;

        System.out.println(concederEmprestimo);
    }
}
