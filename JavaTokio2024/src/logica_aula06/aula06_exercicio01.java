package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		if(num /2== 0) {
			System.out.println("Seu numero é par");
		}else {
			System.out.println("Seu numero é impar");
		}
	}

}
