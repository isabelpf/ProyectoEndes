package tanda3;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(suma());
	}

	public static int suma() {
		Scanner teclado = new Scanner(System.in);
		int suma = 0, x, y;
		System.out.println("Primer n�mero");
		x = teclado.nextInt();
		System.out.println("Segundo n�mero");
		y = teclado.nextInt();
		suma = x + y;
		teclado.close();
		return suma;
	}

}
