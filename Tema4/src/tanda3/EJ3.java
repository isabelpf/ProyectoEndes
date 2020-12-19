package tanda3;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x, y, opcion;
		do {
			System.out.println();
			System.out.println("Primer número: ");
			x = teclado.nextInt();
			System.out.println("Segundo número: ");
			y = teclado.nextInt();
			System.out.println("Elige una opción:\n" + "1.Sumar\n" + "2.Restar\n" + "3.Multiplicar\n" + "4.Dividir\n"
					+ "5.Salir");
			opcion = teclado.nextInt();
			if (opcion == 1) {
				System.out.println(suma(x, y));
			} else if (opcion == 2) {
				System.out.println(resta(x, y));
			} else if (opcion == 3) {
				System.out.println(multiplicacion(x, y));
			} else if (opcion == 3) {
				System.out.println(division(x, y));
			}
		} while (opcion != 5);
		teclado.close();
	}

	public static int suma(int x, int y) {

		int suma = 0;

		suma = x + y;

		return suma;
	}

	public static int resta(int x, int y) {

		int resta = 0;

		resta = x - y;

		return resta;
	}

	public static int multiplicacion(int x, int y) {

		int multiplicacion = 0;

		multiplicacion = x * y;

		return multiplicacion;
	}

	public static int division(int x, int y) {

		int division = 0;

		division = x / y;

		return division;
	}

}
