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
	
		
	public static int productNumeros(int x, int y) {
		//TODO: 
		return -1;
	}	

	public static int calculaAreaTriangulo(int base, int altura) {
		//TODO: 
		return -1;
	}
	
	public static boolean esParImpar(int numero) {
		//TODO: 
		return false;
	}
	
	public static boolean esPrimo(int n) {
		//TODO
		return false;
		
	}
	
	public static boolean esPerfecto(int n) {
		//TODO:
		return false;
	}
	
	public static boolean  esBisiesto(int year) {
		//TODO:
		return false;
	}
	
	public static boolean esCapicua(int numero) {
		//TODO:
		return false;
	}
	
	public static int numCifras(int numero) {
		//TODO:
		return -1;
	}
	
	public static int numLetras(String cadena) {
		//TODO:
		return -1;
	}
	
	public static char letraDni(String cadena) {
		//TODO:
		return '-';
	}
	
	public static String cambiaLetras(String cadena) {
		//TODO:
		return "";
	}
	
}
