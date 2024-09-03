package atividade_logica_java;
import java.util.Scanner;
public class Exercicios10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos vc tem: ");
		int anos = sc.nextInt();
		
		System.out.println("Digite a quantidade de meses; ");
		int meses = sc.nextInt();
		
		System.out.println("Digite quantos dias: ");
		int dias = sc.nextInt();
		
		int qtdDias = (anos * 365)+(meses * 30) +dias;
		
		System.out.println("Quantidade de dias vivido: "+ qtdDias);
		
	}

}
