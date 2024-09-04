package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Digite um numero 2:");
		float num2 = sc.nextFloat();
		
		System.out.println("Digite um dos operadores \n +  -  *  /");
		char operador = sc.next().charAt(0);
		
		float resultado = 0;
		
		switch(operador) {
		  case '+':
			  resultado = num1+num2;
				System.out.println("Resultado: \n"+resultado);
			  break;
		  case '-':
			  resultado = num1-num2;
				System.out.println("Resultado: \n"+resultado);
			  break;
		  case '*':
			  resultado = num1*num2;
				System.out.println("Resultado: \n"+resultado);
			  break;
		  case'/':
			  if(num2!=0) {
				  resultado = num1/num2;
					System.out.println("Resultado: \n"+resultado);
			  }else {
				  System.out.println("Não é possivel dividir por 0");
			  }
			  resultado = num1/num2;
			  break;
		  default:
			  System.out.println("Operador invalido");
		}
		
	}

}
