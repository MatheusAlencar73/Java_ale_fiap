package exercicios_fiap;

import java.util.Scanner;

public class exercicios04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		String idade = sc.nextLine();
		
		System.out.println("Olá, seu nome é: "+ nome + "e sua idade é :"+idade);
		
		sc.close();

}
	
}
