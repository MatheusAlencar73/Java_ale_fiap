package logica_aulas_04;
import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.printf("Olá, %s\n", nome);
		
		sc.close();
		
	}

}
