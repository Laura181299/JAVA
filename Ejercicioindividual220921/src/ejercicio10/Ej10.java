package ejercicio10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // entrada de datos por sistema
		
		String usuario,contraseña;
		
		System.out.println("Usuario: ");
		usuario = teclado.nextLine();
		System.out.println("Contraseña: ");
		contraseña = teclado.nextLine();
		
		String contraseña1="12345";
		String usuario1="Laura";
		
		if(usuario.matches(usuario1) && contraseña.matches(contraseña1)) {
			System.out.println("El usuario y la contraseña con correctos. Modifica la clave");
			contraseña1 = teclado.nextLine();
			System.out.println("La clave ha sido modificada con éxito");
		}
		else
			System.out.println("El usuario o la clave son incorrectos");
		
		teclado.close();
		
	}
		
}


