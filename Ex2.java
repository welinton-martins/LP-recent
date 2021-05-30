import java.util.Scanner;

class ex3 {
	public static void  main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int horIni, horFin, temp = 0;

		horIni = in.nextInt();
		horFin = in.nextInt();
		
		in.close();
		
		if (horIni > horFin) {
		    for (int i = horIni; i < 24; i++) {
		        temp += 1;
		    }
		    for (int i = 0; i < horFin; i++) {
		        temp += 1;
		    }
		}
		else if (horIni == horFin){
		    temp = 24;
		}
		else {
		    for (int i = horIni; i <0 horFin; i++) {
		        temp += 1;
		    }
		}
		
		System.out.println("O JOGO DUROU " + temp + " HORA (S)");
	} 
}