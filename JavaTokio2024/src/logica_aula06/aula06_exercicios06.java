package logica_aula06;

import java.util.Scanner;

public class aula06_exercicios06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano que você nasceu:");
		int ano = sc.nextInt();
		
		int idade = 2024 - ano;
		
		if(idade >= 16 && idade < 18||idade > 70){
			System.out.println("Voto opcional");
		}else if(idade >=18 && idade <= 70) {
			System.out.println("Voto obrigatorio");
		}else{
			System.out.println("seu voto é proibido");
		}
		
	}

}
