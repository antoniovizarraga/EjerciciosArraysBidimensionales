package ejerciciosarraysbidimensionales;

import java.util.Random;
import java.util.Arrays;

/* Vamos a crear un programa que genere 20 valores aleatorios del 100 al 999,
 * y los meta en un Array de 4 x 5. Para que luego, usando bucles for
 * imprimamos la suma de cada columa y fila en su lugar
 * correspondiente, además de indicar la suma total de
 * todas las filas o de todas las columnas en la esquina
 * inferior derecha. */
public class Ejercicio05 {

	// Función que genera un array bidimensional de 4x5 con números aleatorios entre
	// 100 y 1000
	public static int[][] randomArray() {
		// Declaración del array bidimensional
		int[][] table = new int[4][5];

		// Creación de un objeto Random para generar números aleatorios
		Random rand = new Random();

		// Bucle para rellenar el array con números aleatorios
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				table[i][j] = rand.nextInt(100, 1000);
			}
		}

		// Devuelve el array generado
		return table;
	}

	// Función principal
	public static void main(String[] args) {

		// Declaración del array bidimensional
		int[][] table = new int[4][5];

		// Copia el array generado por la función randomArray en el array table
		table = Arrays.copyOf(randomArray(), 4);

		// Variables para almacenar las sumas de las filas, las columnas y el total
		int sumaFilas = 0;
		int sumaColumnas = 0;
		int sumaTotal = 0;

		// Bucle para sumar los valores de las filas y el total, e imprimir los valores
		// y la suma de cada fila
		for (int[] fila : table) {
			for (int valor : fila) {
				sumaFilas += valor;
				sumaTotal += valor;
				System.out.print(valor + "\t");
			}
			System.out.print("Suma Fila " + sumaFilas);
			sumaFilas = 0;
			System.out.println();
		}

		// Bucle para sumar los valores de las columnas e imprimir la suma de cada
		// columna
		for (int j = 0; j < table[0].length; j++) {
			for (int i = 0; i < table.length; i++) {
				sumaColumnas += table[i][j];
			}
			System.out.print(sumaColumnas + "\t");
			sumaColumnas = 0;
		}

		// Imprime la suma total de todos los valores del array
		System.out.print("Suma total: " + sumaTotal);
	}
}
