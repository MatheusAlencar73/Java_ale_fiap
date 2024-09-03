package logica_aula06;

public class Condicionais {

	public static void main(String[] args) {
		
		//Estrutura Condicional Simples
		/*-------------------------------
		float nota = 7;
		
		if(nota < 6) {
		
		System.out.println("sua nota é:" + nota);
	}
		System.out.println("FIM");
*/
		
		//Estrura Condicional Composta
		/*-------------------------------
		float nota = 10;
		
		if(nota <6) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
		
		System.out.println("FIM");
		*/
		
		//Estrutura condicional encadeada
		/*-----------------------------------
		float nota = 10;
		
		if(nota < 4) {
			System.out.println("Reprovado");
		}else {
			if(nota<6) {
				System.out.println("Recuperação");
			}else {
				System.out.println("Aprovado");
			}
		}
		*/
		
		//Estrutura condicional composta – else if
		
		/*----------------------------------
		 * float nota1 = 10;
		
		if(nota1 < 4) {
			System.out.println("Reprovado");
		}else if(nota1<6) {
				System.out.println("Recuperação");
			}else {
				System.out.println("Aprovado");
			}
		*/
		
	}
}
