package logica_aula09;

public class vetores {

	public static void main(String[] args) {
		
		int[] vetorInteiro = new int[10];
		
		vetorInteiro[0] = 10;
		vetorInteiro[1] = 1999;
		
		System.out.println("Valor inteiro na posição zero: "+ vetorInteiro[0]);
		
		int anoNasc = vetorInteiro[1];
		System.out.println("Ano nascimento: " + anoNasc);
		
		int posicao = 1;
		System.out.println(vetorInteiro[posicao]);
		
		String[]listaFrutas = new String[4];
		
		listaFrutas[0]= "Morango";
		listaFrutas[1]= "Banana";
		listaFrutas[2]= "Maça";
		listaFrutas[3]= "Uva";
		
		System.out.println("");
		
		System.out.println("Fruta na poiscao 1: "+listaFrutas[1]);
		
		String[] listaFrutas2 = {"Melancia","Abacaxi","Pitaia","Mamao","jaca"};
		
		

		int qtdFrutas = listaFrutas2.length;
		System.out.println("qtd de Frutas: " + qtdFrutas);
	
		
		for(int i =0; i < listaFrutas2.length; i++) {
			System.out.println(listaFrutas2[i]);
		}
		
		int[] numeros = {16,24,29,33};
		
		
		System.out.println();
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
	}

}
