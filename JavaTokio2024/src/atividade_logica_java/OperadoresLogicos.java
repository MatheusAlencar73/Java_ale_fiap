package atividade_logica_java;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		boolean logicaOU = true || false;
		System.out.println(logicaOU);
		
		boolean negacao = !false;
		System.out.println(negacao);
		
	}

}
