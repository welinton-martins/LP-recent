import java.util.Scanner;

public class MediaDasNotas {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float nota1, nota2, media; 
        
        System.out.println("Digite as notas das 2 provas: ");

        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);
   } 
}
