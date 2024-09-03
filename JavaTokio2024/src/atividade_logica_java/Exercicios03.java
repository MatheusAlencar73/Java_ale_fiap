package atividade_logica_java;
import java.util.Scanner;
public class Exercicios03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Olá " + nome + " Digite seu genero: \n M = Masculino \n F = Feminino \n O = Outro \n N = não responder \n");
		char genero = sc.nextLine().charAt(0);
		System.out.println("Seu nome é" + nome + " e seu genero é "+ genero);
	}

}
