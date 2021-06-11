public class Excecoes {
       public static int dividir(int a, int b) throws IllegalArgumentException, ArithmeticException {
            if (a < 0 || b < 0) {
                    throw new IllegalArgumentException("Valores negativos");
            }
            if (b == 0) {
                    throw new ArithmeticException("Divisao por zero");
            }
            return a / b;
       }

       public static void main(String[] args) {
            try {
                System.out.println(dividir(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
             
        }
} 