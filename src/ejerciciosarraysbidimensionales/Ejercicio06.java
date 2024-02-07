package ejerciciosarraysbidimensionales;

import java.util.Random;
import java.util.Arrays;

/**
 * Clase Ejercicio06 que contendrá el ejercicio 6.
 */
public class Ejercicio06 {

	/**
	 * Vamos a crear un programa con una función que reciba una tabla
	 * bidimensional en la que, creando un nuevo Array de una
	 * dimensión (Ya que el ejercicio dice que debe devolver
	 * un Array de dos posiciones, pero no especifica si
	 * debe ser bidimensional o no), contenga en la
	 * primera posición el valor mínimo y en la
	 * última posición el valor máximo. Luego
	 * los mostraremos por pantalla.
	 * @param table Tabla bidimensional que contendrá los valores para saber cuál de ellos es el mínimo y el máximo.
	 * @return arrayToReturn Devuelve el array de dos posiciones que contiene el mínimo y el máximo.
	 */
	public static int[] minMaxInArray(int[][] table) {
		// Creamos el Array de 2 posiciones.
		int[] arrayToReturn = new int[2];
		
		// Creamos los valores que serán el mínimo y el máximo.
		/* Les asignamos cualquier valor del Array para luego
		 * comparar todos los valores y así saber cuál es el
		 * máximo y el mínimo. */
		int max = table[0][0];
		int min = table[0][0];
		
		// Bucle for que comprueba cuál es el máximo y cuál es el mínimo.
		for (int[] fila : table) {
			for (int valor : fila) {
				if(valor >= max) {
					max = valor;
				}
				
				if(valor <= min) {
					min = valor;
				}
				
			}

		}
		// La primera posición tendrá el mínimo
		arrayToReturn[0] = min;
		
		// La segunda posición el máximo
		arrayToReturn[1] = max;
		
		// Lo retornamos.
		return arrayToReturn;
	}
	
	
	
	public static void main(String[] args) {
		// Variable random que generará valores aleatorios
		Random rand = new Random();
		
		// Array que contendrá las filas y columnas rellenas de
		// valores aleatorios.
		int[][] table = new int[6][10];
		
		// Array que será el que reciba el máximo y el mínimo.
		int[] arrayMinMax = new int[2];
		
		/* Bucle for que rellenará el bucle bidimensional de
		 * valores aleatorios que vayan del 0 al 1000 (Ambos
		 * incluidos). */
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[0].length; j++) {
				table[i][j] = rand.nextInt(0, 1001);
			}
		}
		
		// Guardamos el mínimo y el máximo con el Array.
		/* ACLARACIÓN: Sé que si lo igualo, cambia la
		 * referencia en memoria del Array simplemente,
		 * pero con las funciones que retornan un Array
		 * no sé si hacer un copyOf (Lo intenté pero no
		 * pude) o igualarlo directamente en este caso,
		 * ya que como se dijo en el ejercicio que era
		 * un Array de dos posiciones... De momento lo
		 * dejaré así hasta que se aclare, que entonces
		 * ahí lo cambiaré. :) */
		arrayMinMax = minMaxInArray(table);
		
		// Imprimimos el Array.
		System.out.println(Arrays.toString(arrayMinMax));
		

	}

}
