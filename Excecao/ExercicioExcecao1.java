package TratamentoDeExcecoes;

public class ExercicioExcecao1 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Erro 1: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro 2: " + e.getMessage());
        }
    }
}