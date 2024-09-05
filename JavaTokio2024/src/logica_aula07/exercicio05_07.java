package logica_aula07;

import java.util.Scanner;

public class exercicio05_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		int maior = 0;
		
		System.out.println("Digite um numero: ");
		
		i =sc.nextInt();
		
		maior = i;
		while(true) {
			System.out.println("Digite outro numero: ");
			i = sc.nextInt();
			
			if(i> maior) {
				System.out.println("seu numero maior é "+i);
			}else {
				maior = maior;
				System.out.println("seu numero maior é "+maior);
			}
		}
	}
}


