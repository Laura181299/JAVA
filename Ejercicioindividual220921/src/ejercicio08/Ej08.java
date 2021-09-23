package ejercicio08;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;	
		
		System.out.println("Introduce un numero (0-10): ");
		numero = teclado.nextInt();
		teclado.close();
		
		if (numero>=0 && numero<=10) {
			for (int i = 0; i<=10; i++) { 
				System.out.println(numero+" x "+i+" = "+i*numero);
				}
			}
		else
			System.out.println("El número debe estar entre 0 y 10");

	}

}
