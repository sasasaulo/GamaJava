package access.privatee.classs.from.outside;

public class Carro {

	private String nome;
	
	//não é acessível pois é privado
	private void exibeVelocidade() {
		System.out.println("A velocidade de um " + nome + " é de 322km/h");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return this.nome;
	}
}
