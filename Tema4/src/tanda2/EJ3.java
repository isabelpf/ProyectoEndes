package tanda2;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suma();
	}

	public static void suma() {
		Scanner teclado = new Scanner(System.in);
		int suma = 0, x, y;
		System.out.println("Primer número");
		x = teclado.nextInt();
		System.out.println("Segundo número");
		y = teclado.nextInt();
		suma=x+y;
		System.out.println(suma);
		teclado.close();
	}

}
