package ejercicio04;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // entrada de datos por sistema
		
		float nota;	
		
		System.out.println("Introduce una nota (1-7): ");
		nota = teclado.nextFloat();
		
		teclado.close();
		
		if (nota>=1 && nota<=3.9)
			System.out.println("Insuficiente");
		else if (nota>=4 && nota<=5.9)
			System.out.println("Suficiente");
		else if (nota>=6 && nota<7)
			System.out.println("Bien");
		
	}

}
