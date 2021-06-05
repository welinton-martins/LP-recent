import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
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
        do {
            try {
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
                }
            } catch (NoSuchElementException e) {
                e.
            }
        } while (op != 0);
        in.close();
	}
	private static void ImportarImoveis() {
        Scanner in = new Scanner(System.in);
        

        try {
            System.out.println("Insira o nome do Imovel:");
            
        } catch (Exception e) {
            //TODO: handle exception
        }
	}

	private static void ExportarImoveis() {
	
	}

    private static void ListarImoveis() {
        try {
            ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("imobiliaria.csv")));
            while (true) {
                Imovel i = (Imovel) input.readObject();
                System.out.printf("%d - %10.2f\n", i.referencia, i.valor);
            }
        } catch (EOFException e) {
            System.out.println("Fim dos registros");
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto inválido");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
    }

	private static void MostrarDetalheDoImovel() {

	}

	private static void InserirNovoImovel() {
		
	}

	private static void RemoverImovel() {
		
	}
}
