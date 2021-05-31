import java.utils.Scanner;

class ex3 {
	public static void  main(Sring[] args) {
		Scanner in = new Scanner(System.in);
	
		int horIni, horFin;

		horIni = in.nextInt();
		horFin = in.nextInt();
		
		for (int i = horIni; i < horFin; i++) {
			i++;
		}
		System.out.println(i);
	}
}