import java.util.Scanner;

public class MaiorQueZero {
    public static boolean maior(int[] v) {
        boolean m = true;
        for (int i : v) {
            if (i <= 0) {
                m = false;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos numeros: ");
        try {
            int q = in.nextInt();
            int[] v = new int[q];
            for (int i = 0; i < q; i++) {
                System.out.print((i+1) + " numero: ");
                v[i] = in.nextInt();
            }
            System.out.println(maior(v));    
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
} 