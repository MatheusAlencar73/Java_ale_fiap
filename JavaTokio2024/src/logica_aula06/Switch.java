package logica_aula06;

public class Switch {

	public static void main(String[] args) {
		
		int tipoUsuario = 1;
		
		
		switch(tipoUsuario) {
			case 0:
				System.out.println("Usuario adm");
				break;
			case 1:
				System.out.println("usuario Cliente");
				break;
			default:
				System.out.println("Error");
		}
	}

}
