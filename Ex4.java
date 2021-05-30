import java.util.Scanner;

class MarcaAumovel {
	public static void  main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    System.out.print("Informe o numero da marca do automovel: ");
	    int marca = in.nextInt();
	    switch (marca) {
	        case 1:
	           System.out.println("Chevrolet");
	           break;
	        case 2:
	           System.out.println("Volkswagen");
	           break;
	        case 3:
	           System.out.println("Fiat");
	           break;
	        case 4:
	           System.out.println("Honda");
	           break;
	        default:
	           System.out.println("Marca desconhecida!");
	           break;
	    }
	    in.close();
	} 
}