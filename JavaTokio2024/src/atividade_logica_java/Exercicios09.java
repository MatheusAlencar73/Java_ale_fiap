package atividade_logica_java;

import java.util.Scanner;

public class Exercicios09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero entre 1 a 999:");
		String num = sc.nextLine();
		
		int numInt = Integer.parseInt(num);
		
		int centena = numInt / 100;
		int centena1 = centena *100;
		int dezena = numInt % centena1;
		int dezena1 = dezena / 10;
		int dezena10 = dezena1 *10;
		int unidade = dezena % dezena10; 
		
		System.out.println("Valor digitado: " + numInt);
		System.out.println(" Centana: " + centena1+ "\n Dezena: " + dezena10+ "\n Unidade: "+ unidade);
		
		
	
	}

}
