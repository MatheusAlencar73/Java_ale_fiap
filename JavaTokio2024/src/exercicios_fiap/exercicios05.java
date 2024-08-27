package exercicios_fiap;

import java.util.Scanner;

public class exercicios05 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Scanner scslr = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite seu salario: ");
			String salario = scslr.nextLine();
			
			System.out.println("Olá, seu nome é: "+ nome+" e seu salario é: "+ salario);


			sc.close();
			scslr.close();
	}

}
