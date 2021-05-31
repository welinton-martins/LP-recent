import java.util.Scanner;

public class AreaDoCirculo {
 
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		float n = Float.parseFloat(String.format("%.5f",Math.PI)), area = 0;
		
		System.out.print("Informe o raio: ");

	 	float raio = in.nextFloat();

		area = (float) (n * Math.pow(raio, 2));

		System.out.printf("A=%.4f\n",area);

    }
 
}
