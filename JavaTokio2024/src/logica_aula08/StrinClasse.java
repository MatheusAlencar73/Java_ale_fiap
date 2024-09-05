package logica_aula08;

public class StrinClasse {

	public static void main(String[] args) {
		
		String str = "Fiap Paulista";
		
		int tamanhoStr = str.length();
		
		System.out.println(tamanhoStr);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println("-------");


		
		for( int i = 0; i< 13; i++) {
			System.out.println(str.charAt(i));
		}
	}

}
