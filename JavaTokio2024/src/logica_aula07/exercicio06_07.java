package logica_aula07;

import java.util.Scanner;

public class exercicio06_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nuero:");
		
		int n = sc.nextInt();
		
		 for(int i = 2; i<=n; i+=2) {
			 System.out.println(i);
		 }
		 
	}

}
