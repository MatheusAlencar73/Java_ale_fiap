package atividade_logica_java;
import java.util.Scanner;
public class Exercicios05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota A: ");
		String notaA = sc.nextLine();
		
		System.out.println("Digite a nota B: ");
		String notaB = sc.nextLine();
		
		float  notaAFloat = Float.parseFloat(notaA);
		float  notaBFloat = Float.parseFloat(notaB);
		
		float soma1 = notaAFloat* 4 + notaBFloat *6;
		float divisao = soma1 /10;
		
		System.out.println("Está é a media ponderada: " + divisao );
	}

}
