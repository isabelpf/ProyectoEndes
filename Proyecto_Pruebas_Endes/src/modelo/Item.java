/**
 * 
 */
package modelo;

/**
* @author: Isabel Jardón
* Fecha: 4 dic. 2020
* version: 1.0
*
**/
public class Item {
	String nombre;
	int numero;
	public Item() {
		nombre="isabel";
		numero=0;
	}
	public Item(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
