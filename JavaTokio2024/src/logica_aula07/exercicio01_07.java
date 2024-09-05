package logica_aula07;

import java.util.Scanner;

public class exercicio01_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String msg;
		
		do {
			System.out.println("Hello Wolrd");
			System.out.println("Você desseja repitir a menssagem");
			msg = sc.nextLine();
			
		}while(msg.equals("Sim") );
			
		
			System.out.println("Fim");
	}

}
