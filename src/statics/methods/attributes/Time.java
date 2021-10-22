package statics.methods.attributes;

public class Time {

	String atleta;
	
	static String professor;
	
	static void treinar() {
		System.out.println(professor); //só instancia quando o atributo não é estático
		//System.out.println(atleta); 
	}
	
}
