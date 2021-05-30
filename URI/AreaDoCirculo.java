import java.util.Scanner;

public class AreaDoCirculo {
 
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		double n = Double.parseDouble(String.format("%.5f",Math.PI)), area = 0;
		
		System.out.print("Informe o raio: ");

	 	float raio = (float) in.nextFloat();

		area = n * Math.pow(raio, 2);

		System.out.printf("A=%.4f\n",area);

    }
 
}