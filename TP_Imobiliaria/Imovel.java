import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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
                System.out.print("Opção: ");
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
                e.printStackTrace();
            }
        } while (op != 0);
        in.close();
	}
	private static void ImportarImoveis() {
        Imovel i = new Imovel();
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o nome do arquivo: ");
        File arquivo = new File(in.next());
        try {
            if(!arquivo.exists()) {
                arquivo.createNewFile();
            }
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            while (br.ready()) {
                int[] c = br.read();
                int i = 0; 
                i.referencia = c[0];
                i.tipo = c[1];
                i.
                System.out.printf("%c", c);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");
        }
	}

	private static void ExportarImoveis() {
	
	}

    private static void ListarImoveis() {
        ObjectInputStream input = null;
        try {
            //input = new ObjectInputStream(Files.newInputStream(Paths.get("imovel.csv")));
            while (true) {
                Imovel i = (Imovel) input.readObject();
                System.out.printf("%d - %10.2f\n", i.referencia, i.valor);
                return;
            }
        } catch (EOFException e) {
            System.out.println("Fim dos registros");
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto inválido");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo!");
                }
            }
        }
    }

	private static void MostrarDetalheDoImovel() {

	}

	private static void InserirNovoImovel() {
		
	}

	private static void RemoverImovel() {
		
	}
}
