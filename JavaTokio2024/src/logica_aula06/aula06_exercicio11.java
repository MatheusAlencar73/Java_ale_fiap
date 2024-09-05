package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio11 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("origem da carga (1-5)");
		int estado = sca.nextInt();
		
		System.out.println("Digite o peso do caminhao em tonelada");
		double pesoTonelada= sca.nextDouble();
		
		System.out.println("Codigo da carga (10-40)");
		int codCarga = sca.nextInt();
		
		double peso = pesoTonelada * 1000;
		
		double precoPorKG = 0;
		
		if(codCarga >=10 && codCarga <=20) {
			precoPorKG = 100;
		}else if(codCarga <=30){
			precoPorKG = 250;
		}else if(codCarga <=40 ) {
			precoPorKG = 340;
		}

		double impostoPorce = 0;
	
		if(estado ==1) {
			impostoPorce = 0.35;
		}else if(estado == 2) {
			impostoPorce = 0.25;
		}else if(estado == 3) {
			impostoPorce = 0.15;
		}else if(estado == 4) {
			impostoPorce = 0.05;
		}else if(estado == 5){
			impostoPorce = 0;
		}
		
		
		double precoCarga = peso* precoPorKG;
		
		double imposto = precoCarga* impostoPorce;
		
		double valorFinal = precoCarga *imposto;
		
		System.out.println("Peso de carga em kg:"+peso);
		System.out.println("Preco da carga:"+precoCarga);
		System.out.println("Valor do imposto:"+imposto);
		System.out.println("Valor Final:"+valorFinal);
		
		
	}

}
