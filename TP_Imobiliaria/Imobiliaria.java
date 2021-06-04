import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Imovel {
	private int referencia;
	private String tipo;
	private int quartos;
	private String bairro;
	private float valor;
	
	public static void main(String[] args) {
        if (args.lenght == 0) {
            System.out.println("Uso incorreto!");
            System.exit(1);
        }
        Scanner in = new Scanner(System.in);
		//var op = 0;
        try {
            FileWritter fw = new FileWriter(args[0]);
            BufferedWriter bw = new BufferedWriter(fw);
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");
        }
        in.close();
		// while (true) {
		// 	switch (op) {
		// 		case 1:
		// 			break;
		// 		case 2: 
		// 			break;
		// 		case 3:
		// 			break;
		// 		case 4:
		// 			break;
		// 		case 5:
		// 			break;
		// 		case 6:
		// 			break;
		// 		case 7:
		// 			break;

		// 	System.out.print("Informe uma opcao: ");
		// 	}
		}	
	}
    
	public static void ImportarImoveis() {
	
	}

	public static void ExportarImoveis() {
	
	}

	public static void MostrarDetalheDoImovel() {

	}

	public static void InserirNovoImovel() {
		
	}

	public static void RemoverImovel() {
		
	}

	public static void Sair() {
		
	}
}
