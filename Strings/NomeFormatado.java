package strings;

import java.util.Scanner;

public class NomeFormatado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe seu nome completo: ");

        String nome = in.nextLine();

        in.close();

        String nomeForm = "";
        int posFin = 0;
        
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                if (nomeForm.equals(""))
                    posFin = i;    
                nomeForm = nome.substring(i);
            }                
        }

        nomeForm = String.format("%s, %s", nomeForm, nome.substring(0, posFin));

        System.out.println(nomeForm);

    }
}