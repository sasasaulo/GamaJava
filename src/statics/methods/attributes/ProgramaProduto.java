package statics.methods.attributes;

public class ProgramaProduto {
	
	public static void main(String[] args) {
		System.out.println(Produto.resultado(10, 50));
		
		Produto prod = new Produto();
		
		System.out.println(prod.mudeNomeProduto("Jõao"));
		
		System.out.println(Produto.pegarCpf("         999-222-22   2-11 "));
	}

}
