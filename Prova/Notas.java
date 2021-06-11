import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Notas {

	public static void main(String[] args) {
        String[] c = new String[3];
        int m = 0;
		File arquivo = new File("notas.csv");
		try {
			if (!arquivo.exists()) {
				arquivo.createNewFile();
			}
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String l = br.readLine();
				if (l.startsWith("Welinton")) {
                    c = l.split(";");
                    for (int i = 1; i < c.length; i++) {
                        m += Integer.parseInt(c[i]);
                    }
                }
			}
            if (c[0] != null) {
                System.out.printf("Media do aluno %s: %d\n", c[0], m /= 2);
            } else {
                System.out.printf("Aluno nao encontrado.\n");
            }
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado!");
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita");
		} 
		
	}

}
