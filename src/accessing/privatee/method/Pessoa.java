package accessing.privatee.method;

public class Pessoa {
	
	private String name = "Saulo";
	
	private String pegarNome(String visitanteNome) {
		System.out.println("Quem é?.." + visitanteNome);
		return name;
	}

}
