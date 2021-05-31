package br.fatec.arquivos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o nome de um arquivo ou diretorio: ");
		Path path = Paths.get(in.nextLine());
		if (Files.exists(path)) {
			System.out.printf("\n%s existe\n", path.getFileName() );
			System.out.printf("%s um diretorio\n",
					Files.isDirectory(path) ? "E'" : "Nao e'");
			System.out.printf("%s um caminho absoluto\n",
					path.isAbsolute() ? "E'" : "Nao e'");
			System.out.printf("Ultima modificacao: %s\n",
					Files.getLastModifiedTime(path));
			System.out.printf("Tamanho: %s bytes\n", 
					Files.size(path) );
			System.out.printf("Caminho: %s\n", path );
			System.out.printf("Caminho absoluto: %s\n", 
					path.toAbsolutePath());
			if (Files.isDirectory(path)) { // listagem de diretório de saída			
				System.out.println("\nConteudo do diretorio:");
				// objeto para iteração pelo conteúdo de um diretório
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				for (Path p : directoryStream) {
					System.out.println(p);
				}
			}			
		}
		else {
			System.out.printf("%s nao existe\n", path);
		}
		in.close();
	}
}
