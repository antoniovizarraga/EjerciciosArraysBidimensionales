package ejerciciosarraysbidimensionales;

import java.util.Arrays;

public class Ejercicio04 {

	/* 
	 * The purpose of this program is to generate a 2D array containing multiplication
	 * tables from 1 to 10, and then print the resulting array.
	 */
	public static int[][] timesTable() {
		// Declaration of a 2D array to store multiplication tables.
		int[][] multiplicationTable = new int[10][10];

		// Nested loops to iterate through rows and columns of the array.
		for (int j = 1; j <= multiplicationTable.length; j++) {
			for (int i = 1; i <= multiplicationTable[0].length; i++) {
				// Fill the array with the result of multiplying the row and column index.
				/* Initialize both index from 1 to match the range of multiplication tables
				 * (1 to 10). Subtracting 1 when assigning values ensures correct indexing
				 * in the array, as arrays in Java starts from zero. */
				multiplicationTable[i - 1][j - 1] = i * j;
			}
		}

		// Return the populated 2D array containing multiplication tables.
		return multiplicationTable;
	}

	public static void main(String[] args) {
		// Declaration and initialization of a 2D array to store multiplication tables.
		int[][] tabla = new int[10][10];

		// Copy the result of the timesTable function into the "tabla" array.
		tabla = Arrays.copyOf(timesTable(), 10);

		// Loop to print the values of the 2D array.
		for (int[] fila : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}
}
