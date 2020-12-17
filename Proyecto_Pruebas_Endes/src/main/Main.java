/**
 * 
 */
package main;

import java.util.Scanner;



/**
 * 
 * @author: Isabel Jardón
 * 
 * Fecha: 23 oct. 2020
 *
 * @version: 1.0
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// Preparo para poder leer de teclado
		Scanner teclado = new Scanner(System.in);

		int numero1, numero2;
		System.out.println("Introduzca un valor para el número 1: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduzca un valor para el númeor 2: ");
		numero2 = teclado.nextInt();
		
		System.out.println(numero1+ "-"+numero2+"="+(numero1-numero2));
		
		teclado.close();
		//voy hacer algunos cambios
		
		int j= sumaNumeros(2,3);
	}
	
	/**
	 * Metodo SumaNumeros
	 * 
	 * Suma dos números
	 * Fecha Mod: 4 dic. 2020
	 * @param x int int
	 * @param y valor int
	 * @return la suma de x+y valor int
	 */
	public static int sumaNumeros(int x, int y) {
		return (x+y);
	}
	
	

	
	
}
