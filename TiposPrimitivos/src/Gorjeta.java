import java.util.Scanner;

public class Gorjeta {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float despesas, gorjeta;
		System.out.print("Informe os valor das despesas: R$ ");
		
		despesas = in.nextFloat();
		
		in.close();

		gorjeta = despesas * 0.1f;
		
		System.out.printf("Valor da gorjeta: R$ %.2f", gorjeta);
		

	}

}
