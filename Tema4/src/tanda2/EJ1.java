package tanda2;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Introduce número de asteriscos");
		n = teclado.nextInt();
		System.out.println(asteriscos(n));

		teclado.close();
	}

	public static String asteriscos(int n) {
		String asteriscos="";
		for (int i = 1; i <= n; i++) {
			asteriscos=asteriscos+"*";
		}
		return asteriscos;
	}

}
