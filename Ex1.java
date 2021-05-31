import java.util.Scanner;
import java.util.Random;

class Ex1 {
	public static void  main(String[] args) {
		Scanner in = new Scanner(System.in);
	    Random rand = new Random();
	    
	    int n, m, som = 0, med = 0;
	    String mai = "";
	    
	    n = in.nextInt();
	    m = in.nextInt();
	    
	    int[][] mat = new int[n][m];
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            mat[i][j] = rand.nextInt(n*m*10);
	        }
	    }
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            System.out.print(mat[i][j] + "\t");
	            som += mat[i][j];
	        }
	        System.out.println("");
	    }
	    
	    med = som / (n*m);
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            if (med < mat[i][j]) {
	                mai += mat[i][j] + "\t";
	            }
	        }
	        mai += "\n";
	    }
	    
	    System.out.println("\nMedia: " + med);
	    System.out.println("\nNumeros maiores que a media: \n" + mai);
	   
	    in.close();
	} 
}