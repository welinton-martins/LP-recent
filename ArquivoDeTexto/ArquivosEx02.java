//import java.;

public class ArquivosEx02 {
	public static void main(String[] args) {
		if (args.lenght != 4) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}
		try {
			FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[3]);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fr);
			
		}
	
	}
}
