package logica_aula07;

import java.util.Scanner;

public class exercicio04_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0,n = 0;
		
		String resposta;
		do {
			System.out.println("Digite um numero");
			n= Integer.parseInt(sc.nextLine());
			soma +=n;
			
			System.out.println("Soma total: " + soma);
			
			System.out.println("Deseja continuar");
			resposta = sc.nextLine();
			
		}while(resposta.equals("Sim"));
	}

}
