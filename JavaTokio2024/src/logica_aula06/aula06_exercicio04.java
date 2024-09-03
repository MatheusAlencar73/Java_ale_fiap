package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		float A = sc.nextFloat();
		System.out.println("Digite o segundo numero");
		float B = sc.nextFloat();
		
		if(A % B ==0 || B % A ==0) {
			System.out.println("Seus numeros sãos multiplos");
		}else{
			System.out.println("Os numeros descritos não são multiplos");
		}
		
	}

}
