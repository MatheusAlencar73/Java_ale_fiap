package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de seu salario: ");
		double salarioAtual = sc.nextDouble();
		
		double reajuste;
		
		if(salarioAtual <= 280f) {
			reajuste = 0.2;
		}else if(salarioAtual >280 || salarioAtual <=700){
			reajuste = 0.15;
		}else if(salarioAtual >700 || salarioAtual <=1500) {
			reajuste = 0.1;
		}else {
			reajuste = 0.05;
		}
		
		double valorAumento = salarioAtual * reajuste;
		
		double novoSalario = salarioAtual + valorAumento;
		
		System.out.println("Salario antes do ajuste "+salarioAtual);
		System.out.println("Percentual do aumento aplicado "+reajuste);
		System.out.println("Valor do aumento "+valorAumento);
		System.out.println("Valor do novo salario "+ novoSalario);
	}
	

}
