package br.fatec.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArquivosEx03 {
	public static void main(String[] args) {
		if (args.length != 2) {	
			System.out.println("Uso incorreto!");
			System.exit(1);
		}
		try {
			FileReader fr = new FileReader(args[1]);
			BufferedReader br = new BufferedReader(fr);
			// contina...
		}
	}

}
