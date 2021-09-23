package ejercicio01;

import java.util.Scanner; // importamos la librería Scanner 

public class Ej01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // entrada de datos por sistema
		
		int n1,n2;	
		
		System.out.println("Introduce el primer numero: ");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		n2 = teclado.nextInt();
		
		teclado.close(); // cerrar teclado
		
		if (n1==n2)
			System.out.println("Estos dos números son iguales");
		else
			System.out.println("Estos dos números no son iguales");
	}

}
