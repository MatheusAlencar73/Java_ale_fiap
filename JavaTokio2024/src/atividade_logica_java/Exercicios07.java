package atividade_logica_java;

import java.util.Scanner;

public class Exercicios07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do produto: ");
		String vlr1 = sc.nextLine();
		
		System.out.println("Digite o valor pago: ");
		String pago = sc.nextLine();
		
		Float vlr1Float = Float.parseFloat(vlr1);
		Float pagoFloat = Float.parseFloat(pago);
		
		float troco = pagoFloat - vlr1Float;
		System.out.println("Troco a ser dado: "+ troco);

	}

}
