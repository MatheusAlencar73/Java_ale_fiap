package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu tipo de residencia (1 - 2 - 3)");
		int residencia = sc.nextInt();
		
		System.out.println("Digite quantos watts foram consumido no mes");
		int watts = sc.nextInt();
		
		float valorConta = 0;
		
		if(residencia ==1 ) {
			valorConta = 0.6f;
		}else if(residencia ==2) {
			valorConta = 0.43f;
		}else if(residencia ==3) {
			valorConta = 1.29f;
		}
		
		
		double pagar = watts* valorConta;
		
		System.out.println("Valor a se pagar: "+ pagar);
	}

}
