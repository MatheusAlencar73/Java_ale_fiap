package atividade_logica_java;

import java.util.Scanner;

public class Exercicios08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de reais a ser convertido: ");
		String reais = sc.nextLine();
		
		float reaisFloat = Float.parseFloat(reais);
		
		float dolar = reaisFloat / 5.63f;
		float euro = reaisFloat / 6.23f;
		
		System.out.println("\n Valor em Reais: " + reais);
		System.out.println("\n Valor em Dolar: " + dolar );
		System.out.println("\n Valor em Euro: " + euro);
		
		
	}

}
