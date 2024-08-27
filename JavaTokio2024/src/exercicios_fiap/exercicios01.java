package exercicios_fiap;
import java.util.Scanner;

public class exercicios01 {

	public static void main(String[] args) {
		Scanner scint = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scint.nextInt();
		
		System.out.println("Olá, sua idade é: "+ idade);
		
		scint.close();
	}

}
