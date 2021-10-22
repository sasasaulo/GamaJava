package statics.methods.attributes;

public class Produto {

	//Não precisa inicializar. vantagem; não precisa instanciar
	// quando usar
	public static int resultado(int arroz, int feijao) {
		return (arroz + feijao);
	}
	
	//tem q tornar static para não instanciar
	public String mudeNomeProduto(String nomeProd) {
		return (nomeProd);
	}
	
	
	//tratado
	public static String pegarCpf (String cpf) {
		String tratei = cpf.strip();
		return tratei;
	}
}
