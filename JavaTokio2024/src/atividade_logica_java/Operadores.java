package atividade_logica_java;

public class Operadores {

	public static void main(String[] args) {

		float num1 = 5f;
		float num2 = 2f;
		
		System.out.println(num1);
		System.out.println(num2);

		float soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		float subtracao = num1 - num2;
		System.out.println("Subtracao: " + subtracao);
		
		float multi = num1 * num2;
		System.out.println("multiplicacao: " + multi);
		
		float divisao = num1 / num2;
		System.out.println("Divisao: " + divisao);
		
		float resto = num1 % num2;
		System.out.println("Resto: " + resto);
		
		// OPERADORES UNARIOS
		
		int numero = 15;
		
		System.out.println(" ");
		System.out.println(numero);
		
		
		numero++;
		System.out.println(numero);
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(++numero);
		
		System.out.println(numero+1);
		System.out.println(numero);
		
		numero--;
		System.out.println(numero);
		
		//OPERADORES DE ATRIBUIÇÃO
		int number = 5;
		
		System.out.println(" ");
		System.out.println(number);
		
		//NUMBER = NUMBER  + 7
		number += 7;
		System.out.println(number);
		
		number /= 2;
		
	}

}
