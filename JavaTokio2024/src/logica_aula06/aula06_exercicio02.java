package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero 1:");
		float num1 = sc.nextFloat();
		System.out.println("Digite o numero 2:");
		float num2 = sc.nextFloat();
		
		if(num1 == num2) {
			System.out.println("os numeros possuem o mesmo valor ");
		}else if(num1 > num2){
			System.out.println("o numero 1 é maior que o numero 2 ");
		}else {
			System.out.println("o numero 2 é maior que o numero 1");
		}
	}

}
