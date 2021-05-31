import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Ex1 {
  public static void main(String[] args) {
	
	int qntLin, qntCol;

	Scanner in = new Scanner(System.in);
	Random rand = new Random();

	System.out.print("Informe a quantidade de linhas e colunas");

	qntLin = in.nextInt();
	qntCol = in.nextInt();

	in.close();

	int[][] mat = new int[qntLin][qntCol];
	
	for (int i = 0; i < qntLin; i++) {
		mat[i] = rand.nextInt();
		for (int j = 0; j < qntCol; j++)
			mat[i][j] = rand.nextInt();
	}

	for (int[] lin1 : mat)
		for (int out: lin1) System.out.print(out + "\t");
  }
}