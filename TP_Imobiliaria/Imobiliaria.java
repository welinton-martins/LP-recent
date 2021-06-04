import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Imovel implements Serializable {
	private int referencia;
	private String tipo;
	private int quartos;
	private String bairro;
	private float valor;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int op = 0;
        
        if (args.lenght == 0) {
            System.out.println("Uso incorreto!");
            System.exit(1);
        }
        
        try {
            FileWritter fw = new FileWriter(args[0]);
            BufferedWriter bw = new BufferedWriter(fw);
            do {
			    System.out.println("Imobiliária");
                System.out.println("<1> Importar imóveis");
                System.out.println("<2> Exportar imóveis");
                System.out.println("<3> Listar imóveis");
                System.out.println("<4> Mostrar detalhe do imóvel");
                System.out.println("<5> Inserir novo imóvel");
                System.out.println("<6> Remover imóvel");
                System.out.println("<0> Sair");
                op = in.nextInt();
                switch (op) {
				case 1: ImportarImoveis();
					break;
				case 2: ExportarImoveis();
					break;
				case 3: ListarImoveis();
					break;
				case 4: MostrarDetalheDoImovel();
					break;
				case 5: InserirNovoImovel();
					break;
				case 6: RemoverImovel();
					break;
				case 0: break; 
                default: System.out.println("Opção inválida!");
        } while (op != 0);

        // instancianado o objeto imovel
        //Imovel i = new Imovel();
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");
        }
        
		
        in.close();
		}	
	}
	private static void ImportarImoveis() {
        try {
            O
        } catch (Exception e) {
            //TODO: handle exception
        }
	}

	// private static void ExportarImoveis() {
	
	// }

	// private static void MostrarDetalheDoImovel() {

	// }

	// private static void InserirNovoImovel() {
		
	// }

	// private static void RemoverImovel() {
		
	// }
}
