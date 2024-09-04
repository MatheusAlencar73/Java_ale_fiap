package logica_aula07;

import java.util.Scanner;

public class aula07_While {

	public static void main(String[] args) {
		
		/*
		 * --------------------------------------------
		int i = 0;
		
		while(i< 10) {
			System.out.println("Olá mundo "+i);
			i++;
		}
		-----------------------------------------------
		*/
		
		/*
		  --------------------------------------------
		 String jogar = "Sim";
		
		Scanner sc = new Scanner(System.in);
		
		while (jogar.equals("Sim")) {
			System.out.println("Repita ou inicia o jogo");
			
			System.out.println("Deseja jogar novamente?");
			jogar = sc.nextLine();
		}
		------------------------------------------------
		*/
		
		/*
		-------------------------------------------------
		int i = 0;
		while(i<10){
			i++;
			
			if(i == 3) {
				continue;
			}
			System.out.println("Produto" + i);
		}
		-------------------------------------------------
		*/
		
		
		/*
		 ------------------------------------------------
		int i = 0;
		while (i < 10) {
			i++;
			if (i == 7) {
				break;
			}
			System.out.println("Cambalhota " + i);
		}
		 ------------------------------------------------
		 */
		
	}

}
