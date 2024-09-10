package logica_aula07;

import java.util.Scanner;

public class exercicio08_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		
		int num = sc.nextInt();
		int mm = 1;
		
		do{
			System.out.println(mm+num);
			mm++;
		}while(mm<num);
	}

}
