package atividade_logica_java;

import java.util.Scanner;

public class tipos {

	public static void main(String[] args) {
		
		float preco = 10.99f;
		float preco2 = (float) 12.90;
		
		System.out.println("Float: " + preco);
		System.out.println("Float: " + preco2);
		
		int precoInteiro = (int) 2.5;
		System.out.println("Inteiro: " + precoInteiro);
		
		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println(numeroX);
		System.out.println(numeroXDouble);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("Digite um numero");
		int numeroInteiro = (int) scanner.nextDouble();
		
		Double numeroInteiroClass = (double) numeroInteiro;
		
		System.out.println(numeroInteiro);
		System.out.println(numeroInteiroClass.getClass());
		
		
	}

}
