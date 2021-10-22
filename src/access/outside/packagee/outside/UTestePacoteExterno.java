package access.outside.packagee.outside;

import access.outside.packagee.inside.Produto;

public class UTestePacoteExterno {

	//Não vai funcionar pois os atributos do Produto são do tipo protected
	public static void main(String[] args) {
		Produto prodLuva = new Produto();
		//prodLuva.nomeProd = "Luva";
		//System.out.println(prodLuva.getNomeProd());
	}
}
