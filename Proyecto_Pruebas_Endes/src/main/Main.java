/**
 * 
 */
package main;

import java.util.Scanner;



/**
 * 
 * @author: Isabel Jard�n
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
		System.out.println("Introduzca un valor para el n�mero 1: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduzca un valor para el n�meor 2: ");
		numero2 = teclado.nextInt();
		
		System.out.println(numero1+ "-"+numero2+"="+(numero1-numero2));
		
		teclado.close();
		//voy hacer algunos cambios
		

	}

	
	
}
