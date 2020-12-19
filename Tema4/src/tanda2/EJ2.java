package tanda2;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int filas, columnas;
		System.out.println("Número de filas: ");
		filas = teclado.nextInt();
		System.out.println("Número de columnas: ");
		columnas = teclado.nextInt();
		pintasterisco(filas, columnas);

		teclado.close();
	}

	public static void pintasterisco(int filas, int columnas) {
		String pintasterisco = "*";
		for (int i = 1; i <= filas; i++) {
			System.out.println();
			for (int j = 1; j <= columnas; j++) {
				System.out.print(pintasterisco);
			}
		}
	}

}
