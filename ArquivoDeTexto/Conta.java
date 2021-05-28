package br.fatec.arquivos;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Conta implements Serializable {
	private int numero;
	private String titular;
	private float saldo;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 0;
		do {
			try {
				System.out.println("Conta Bancaria");
				System.out.println("<1> Nova conta");
				System.out.println("<2> Listar contas");
				System.out.println("<0> Sair");
				System.out.print("Opcao: ");
				op = in.nextInt();
				switch (op) {
				case 1:
					novaConta();
					break;
				case 2:
					listarContas();
					break;
				case 0:
					break;
				default:
					System.out.println("Opcao invalida!");
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		} while (op != 0);
		in.close();
	}

	private static void listarContas() {
		try {
			ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.dat")));
			while (true) {
				Conta c = (Conta) input.readObject();
				System.out.printf("%d - %-20.20s %10.2f\n", c.numero, c.titular, c.saldo);
			}
		} catch (EOFException e) {
			System.out.println("Fim dos registros");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		}
	}

	private static void novaConta() {
		Conta c = new Conta();		
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Numero: ");
			c.numero = in.nextInt();
			System.out.print("Titular: ");
			in.nextLine();
			c.titular = in.nextLine();
			System.out.print("Saldo: R$ ");
			c.saldo = in.nextFloat();			
			Path path = Paths.get("contas.dat");
			if (Files.exists(path)) {
				FileOutputStream fos = new FileOutputStream("contas.dat", true);
				AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos);				
				output.writeObject(c);
				output.close();
			}
			else {
				ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path));
				output.writeObject(c);
				output.close();
			}			
		} catch (IOException e) {
			System.out.println("Erro de escrita no arquivo!");
		}
	}

}
