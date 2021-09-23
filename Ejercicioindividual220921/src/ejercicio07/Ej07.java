package ejercicio07;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Variables
		float s; // sueldo
		float suma=0;
		int cont=0;
		
		// Procedimiento
		for (int i=1; i<=5; i++) {
			System.out.println("Introduce un sueldo");
			s = teclado.nextFloat();
			suma = suma + s;
			if (s>2000)
				cont = cont + 1;
		}
		
		teclado.close();
		
		System.out.println("Suma de los sueldos: "+suma);
		System.out.println("Sueldos mayores que 2000: "+cont);

	}

}
