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
		
		
		//voy hacer algunos cambios
		
		int j= sumaNumeros(2,3);
		String cadena;
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		System.out.println(numLetras(cadena));
	}
	
	/**
	 * Metodo SumaNumeros
	 * 
	 * Suma dos n�meros
	 * Fecha Mod: 4 dic. 2020
	 * @param x int int
	 * @param y valor int
	 * @return la suma de x+y valor int
	 */
	public static int sumaNumeros(int x, int y) {
		return (x+y);
	}
	//Inicio de M�todos
	
	/**
	 * TODO Implementation Jose Luis  
	 * 
	 */
	public static int productNumeros(int x, int y) {
		
		return -1;
	}	

	/**
	 * TODO Implementation Adrian Villadongos
	 * 
	 */
	public static int calculaAreaTriangulo(int base, int altura) {
		
		return -1;
	}
	

	/**
	 * TODO Implementation Anton Saiz
	 * 
	 */
	public static boolean esParImpar(int numero) {
		//TODO: 
		return false;
	}
	
	/**
	 * TODO Implementation Isaac Ramirez
	 * 
	 */
	public static boolean esPrimo(int n) {
		//TODO
		return false;
		
	}
	/**
	 * TODO Implementation Alvaro Olloni
	 * 
	 */
	public static boolean esPerfecto(int n) {
		//TODO:
		return false;
	}
	
	/**
	 * TODO Implementation Jorge Antonio
	 * 
	 */
	public static boolean  esBisiesto(int year) {
		//TODO:
		return false;
	}
	/**
	 * TODO Implementation Alvaro Irurozqui
	 * 
	 */
	public static boolean esCapicua(int numero) {
		//TODO:
		return false;
	}
	/**
	 * TODO Implementation Ruben Grana
	 * 
	 */
	
	public static int numCifras(int numero) {
		//TODO:
		return -1;
	}
/**
 * Method numLetras
 * M�todo que calcula cu�ntas letras tiene una cadena
 * @param cadena
 * @return
 */
	
	public static int numLetras(String cadena) {
		
		int resultado = cadena.length();
		
		return resultado;
	}
	/**
	 * TODO Implementation Voluntary
	 * 
	 */
	public static char letraDni(String cadena) {
		//TODO:
		return '-';
	}
	/**
	 * TODO Implementation Voluntary 
	 */
	public static String cambiaLetras(String cadena) {
		//TODO:
		return "";
	}
	//Fin de M�todos
}
