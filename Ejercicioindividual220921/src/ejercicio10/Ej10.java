package ejercicio10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // entrada de datos por sistema
		
		String usuario,contrase�a;
		
		System.out.println("Usuario: ");
		usuario = teclado.nextLine();
		System.out.println("Contrase�a: ");
		contrase�a = teclado.nextLine();
		
		String contrase�a1="12345";
		String usuario1="Laura";
		
		if(usuario.matches(usuario1) && contrase�a.matches(contrase�a1)) {
			System.out.println("El usuario y la contrase�a con correctos. Modifica la clave");
			contrase�a1 = teclado.nextLine();
			System.out.println("La clave ha sido modificada con �xito");
		}
		else
			System.out.println("El usuario o la clave son incorrectos");
		
		teclado.close();
		
	}
		
}


