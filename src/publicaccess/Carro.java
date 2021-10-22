package publicaccess;

public class Carro {

	public String nome;
	
	//Se o método for privado, o programa não conseguirá acessá-lo
	public void exibeVelocidade() {
		System.out.println("A velocidade de um " + nome + " é de 322km/h");
	}
}
