package logica_aula07;

import java.util.Scanner;

public class exercicio03_07 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int n = sc.nextInt();
		
		int i  = 1;
		
		while(i <=25) {
			System.out.println(n+"*"+ i+ "="+ n*i);
			i++;
		}
	}

}
