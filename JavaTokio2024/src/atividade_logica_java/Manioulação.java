package atividade_logica_java;

import java.util.Scanner;

public class Manioulação {

	public static void main(String[] args) {
		
		Double salario = 1416.30;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salario+salario);
		System.out.println(salarioStr+salarioStr);
		
		System.out.println(" ");
		
		String idade = "18";
		int idadeInteiro = Integer.parseInt(idade);
		
		System.out.println(idadeInteiro);
		
		System.out.println(" ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preco do produto");
		String preco = sc.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		
		System.out.println(preco + preco );
		System.out.println(precoFloat + precoFloat);
		
	}

}
