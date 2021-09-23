package ejercicio06;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;	
		
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();
		
		do {
			int cuadrado;
			cuadrado=numero*numero;
			System.out.println(cuadrado);
			System.out.println("Introduce un numero: ");
			numero = teclado.nextInt();
		}
		while(numero>0);
		
		teclado.close();
		
	}

}
