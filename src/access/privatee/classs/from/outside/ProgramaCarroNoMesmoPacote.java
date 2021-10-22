package access.privatee.classs.from.outside;

public class ProgramaCarroNoMesmoPacote {
	
	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.setNome("Ferrari");
		System.out.println(c.getNome());
		
	}
}