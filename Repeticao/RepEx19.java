package repeticao;
import java.util.Scanner;

public class RepEx19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, resto;

        System.out.println("Informe 2 numeros inteiros positivos: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        do {
            resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        } while (resto != 0);
    }
}

