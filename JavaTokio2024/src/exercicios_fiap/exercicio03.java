package exercicios_fiap;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Olá, seu nome é: "+ nome);
		
		sc.close();
}
	
}
