package ejercicio03;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // entrada de datos por sistema
		
		int n1,n2,n3;	
		
		System.out.println("Introduce el primer numero: ");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		n2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero: ");
		n3 = teclado.nextInt();
		
		teclado.close();
		
		if (n1>=n2) {
			if (n2>=n3)
				System.out.println(n1+" "+n2+" "+n3);
			else if (n2<=n3 && n1>=n3)
				System.out.println(n1+" "+n3+" "+n2);
			else if (n1<=n3)
				System.out.println(n3+" "+n1+" "+n2);}
		else if (n1<=n2) {
			if (n1>=n3)
				System.out.println(n2+" "+n1+" "+n3);
			else if (n1<=n3 && n2>=n3)
				System.out.println(n2+" "+n3+" "+n1);
			else if (n2<=n3)
				System.out.println(n3+" "+n2+" "+n1);
		}

	}

}
