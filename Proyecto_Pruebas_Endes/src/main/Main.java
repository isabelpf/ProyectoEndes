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
	//Inicio de Métodos
	
	/**
	 * TODO Implementation Jose Luis  
	 * 
	 */
	public static int productNumeros(int x, int y) {
		
		return -1;
	}	

	/**
	 * Dadas la base y la altura de un triangulo, se calcula el area correspondiente
	 * Adrian Villadangos
	 */
	public static double calculaAreaTriangulo(int base, int altura) {
		double areaTriangulo = (base*altura)/2;
		return areaTriangulo;
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
	 * @author Jorge Antonio
	 * Fecha: 18 dic. 2020
	 * @version: 1.0
	 * @param year
	 * @return
	 */
	public static boolean esBisiesto(int year) {
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			return true;
		}
		else {
			return false;
		}
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
	 * TODO Implementation Noelia García 
	 */
	
	public static int numLetras(String cadena) {
		//TODO:
		return -1;
	}
	/**
	 * Method letraDNI
	 * 
	 * Método que calcula la letra de un dni
	 * 
	 * @param cadena
	 * @return
	 */
	public static char letraDni(String cadena) {
		char [] letras= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		int dni= Integer.parseInt(cadena);
		int resto = dni % 23;		
		
		return letras[resto];
	}
	/**
	 * TODO Implementation Voluntary 
	 */
	public static String cambiaLetras(String cadena) {
		//TODO:
		return "";
	}
	//Fin de Métodos
}
