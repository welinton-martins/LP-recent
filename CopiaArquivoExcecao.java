package TratamentoDeExcecoes;

import java.io.*;

public class CopiaArquivoExcecao {
    public static void main(String[] args) {
        if (args.lenght != 2) {
            System.out.println("Uso: java CopiaArquivoExcecao<arq1> <arq2>");
            return;
        }
        File arqEntrada = new File(args[0]);
        File arqSaida = new File(args[1]);
        FileReader leitor = new FileReader(arqEntrada);
        FileWriter escritor = new FileWriter(arqSaida);
        int c;
        while ((c = leitor.read()) != -1)
            escritor.write(c);
        leitor.close();
        escritor.close();
    }
}