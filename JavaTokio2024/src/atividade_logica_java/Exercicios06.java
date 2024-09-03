package atividade_logica_java;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de peças1 que voce quer:");
		String qtd = sc.nextLine();
		
		float qtdFloat = Float.parseFloat(qtd);
		float peca1 = 19.99f;
		
		System.out.println("\n valor unitario da peça: " + peca1);
		
		float valor = peca1 * qtdFloat;
		System.out.println("\n Quantidade de peças: " + qtdFloat);
		System.out.println("\n Valor da peças 1: " + valor);
		
		System.out.println("\n Digite a quantidade de pecas2 que voce quer: ");
		String qtd2 = sc.nextLine();
		
		float qtd2Float = Float.parseFloat(qtd2);
		float peca2 = 16.99f;
		
		System.out.println("\n valor unitario da peça2: " + peca2);

		float valor2 = peca2 *qtd2Float;
		System.out.println("\n Quantidade de peças: " + qtd2Float);
		System.out.println("\n Valor da peças 2: " + valor2);
		
		float total = valor + valor2;
		System.out.println("\n   Valor Total: " + total);

		
		
	}

}
