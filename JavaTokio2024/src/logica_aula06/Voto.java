package logica_aula06;

public class Voto {

	public static void main(String[] args) {
		int idade = 15;
		
		boolean verificaMenorIdade = idade >= 16 && idade <18;
		System.out.println("Voto opicional menor de idade: "+verificaMenorIdade);
		
		boolean verificaVein = idade> 70;
		System.out.println("Voto opicional maior de idade: "+verificaVein);
		
		if(verificaMenorIdade || verificaVein) {
			System.out.println("Voto opcional");
		}
		if(idade >=16 && idade<18 || idade >70 ) {
			System.out.println("Voto opcional");
		}
	}

}
