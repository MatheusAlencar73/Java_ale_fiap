package logica_aula07;

import java.util.Scanner;

public class aula07_exercicios01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		soma = soma + numero;
				
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		soma = soma + numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		numero +=soma;
		System.out.println("resultado da soma é: "+ soma);
		

	}

}
