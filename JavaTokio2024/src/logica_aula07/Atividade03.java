package logica_aula07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero ");
		int n = sc.nextInt();
		
		int i = 0;
		
		while(i<n){
			System.out.println(i);
			i++;
		}
	}

}
