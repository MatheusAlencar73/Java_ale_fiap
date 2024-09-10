package logica_aula09;

public class Matrizes {

	public static void main(String[] args) {

		char[][] tabuleiro = new char[3][3];
				
		tabuleiro[0][0] ='X';
		tabuleiro[1][1] ='O';
		tabuleiro[2][2] ='X';
		
		System.out.println();
		
		int[][] matriz = new int [4][5];
		
		int linhas = matriz.length;
		System.out.println(linhas);
		
		int colunas = matriz[0].length;
		System.out.println(colunas);
		
		System.out.println();
		
		int numero = 1;
		
		//for para incluir valores na matriz;
		
		for(int i = 0; i< linhas; i++) {
			for(int j = 0; j<colunas; j++) {
				matriz[i][j] = numero;
				numero++;
			}
		}
			
		for(int i = 0; i< linhas; i++) {
			for(int j = 0; j<colunas; j++) {
				matriz[i][j] = numero;
				numero++;
				System.out.print(matriz[i][j]+ "\t");
			}
				System.out.println();
		}
		
		
	}

}
