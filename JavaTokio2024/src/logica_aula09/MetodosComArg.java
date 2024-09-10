package logica_aula09;

import java.util.Scanner;

public class MetodosComArg {

	static void saudacaoComArgs(String nome) {
		System.out.println("Seja bem-Vindo, "+ nome);
	}
	
	static void somar(int n1,int n2) {
		System.out.println("soma: "+(n1+n2));
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeDigitado = sc.nextLine();
		
		saudacaoComArgs(nomeDigitado);
		
		somar (14,17);
		
	}

}
