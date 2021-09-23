package ejercicio02;

import java.util.Scanner;

public class Ej02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // entrada de datos por sistema
		
		int n1,n2;	
		
		System.out.println("Introduce el primer numero: ");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		n2 = teclado.nextInt();
		
		teclado.close();
		
		if(n1==n2)
			System.out.println("Los dos números son iguales");
		else if (n1>n2)
			System.out.println("El primer número es mayor que el segundo");
		else if (n1<n2)
			System.out.println("El segundo número es mayor que el primero");
	}

}
