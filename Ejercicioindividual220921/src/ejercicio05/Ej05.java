package ejercicio05;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // entrada de datos por sistema
		
		int d1,d2,m1,m2,a1,a2;	
		
		System.out.println("Introduce el dia de la primera fecha: ");
		d1 = teclado.nextInt();
		System.out.println("Introduce el mes de la primera fecha: ");
		m1 = teclado.nextInt();
		System.out.println("Introduce el año de la primera fecha: ");
		a1 = teclado.nextInt();
		System.out.println("Introduce el dia de la segunda fecha: ");
		d2 = teclado.nextInt();
		System.out.println("Introduce el mes de la segunda fecha: ");
		m2 = teclado.nextInt();
		System.out.println("Introduce el año de la segunda fecha: ");
		a2 = teclado.nextInt();
		
		teclado.close(); // cerramos el teclado

		
		int difdias = d1-d2;
		int difmes = m1-m2;
		int difaños = a1-a2;
		
		int diftotal = Math.abs(difdias) + Math.abs(difmes)*30 + Math.abs(difaños)*365;
		
		System.out.println("Diferencia de dias: "+diftotal);

	}

}
