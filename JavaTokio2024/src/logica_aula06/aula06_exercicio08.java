package logica_aula06;

import java.util.Scanner;

public class aula06_exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a distancia pecorrido com seu Carro");
		double distancia = sc.nextInt();
		
		System.out.println("Digite quanto de combustivel foi gasto ");
		double combustivel = sc.nextInt();
		
		double media = distancia/combustivel;
		
		if(media <=8) {
			System.out.println(media+"KM/L"+"seu carro bebe muito!!");
		}else {
			System.out.println(media+"KM/L"+"seu carro é economico" );
		}
		
	}
}
