class ConcatenaStrings {
	public static void main (String[] args)	{
        String nome = "Welinton";
        float altura = 1.7398f;
        String sobrenome = "Martins";
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Nome completo: " .concat(nome).concat(" ").concat(sobrenome));
        System.out.println(String.format("%s %s %s %.2f", "Nome completo: ",nome, sobrenome, altura));
	}
}
