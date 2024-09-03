package atividade_logica_java;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua Primeiro nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite sua segunda nota ");
		float nota2 = sc.nextFloat();
		
		float soma = nota1 + nota2;
		float divisao = soma /2;
		
		System.out.println("Sua media é " + divisao);
		
		
		
		
	}

}
