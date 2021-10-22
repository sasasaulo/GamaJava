package accessing.privatee.method;

import java.lang.reflect.Method;

public class Programa {

	public static void main(String[] args) {
		try {
			//chama a classe e coloca ela no objetinho
			Object objetinho = Class.forName("accessing.privatee.method.Pessoa").newInstance();
			
			//Chama o método e coloca ela do metodinho
			Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
			
			//metodinho pode ser visto
			metodinho.setAccessible(true);
			
			String nome = (String) metodinho.invoke(objetinho, "yyyy");
			
			System.out.println(nome);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
