package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota 1:");
		float nota1 =sc.nextFloat();
		System.out.println("Digite a nota 2:");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a nota 3:");
		float nota3 = sc.nextFloat();
		System.out.println("Digite a nota 4:");
		float nota4 = sc.nextFloat();
		
		float soma = nota1 + nota2 +nota3 + nota4;
		float media = soma/4;
		
		if(media>=7) {
			System.out.println("Você está Aprovado, Parabens");
		}else if(media >5 && media <7){
			System.out.println("Você está Em Recuperação");
		}else {
			System.out.println("Você está Reprovado");
		}
	}

}
