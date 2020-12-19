package tanda3;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x, y;
		System.out.println("Primer número");
		x = teclado.nextInt();
		System.out.println("Segundo número");
		y = teclado.nextInt();
		System.out.println(suma(x,y));
		teclado.close();
	}

	public static int suma(int x, int y) {

		int suma = 0;

		suma = x + y;

		return suma;
	}

}
