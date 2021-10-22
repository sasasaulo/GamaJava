package test.privatee.method.same.classs;

public class Carro {

	private String nome;
	
	private void exibeVelocidade() {
		System.out.println("A velocidade de um " + nome + " é de 322km/h");
	}
	
	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.nome = "Ferrari";
		c.exibeVelocidade();
	}
}
