package ejerciciosarraysbidimensionales;

public class Ejercicio03 {

	/*
	 * We're going to create a program that will fill an Array with values following
	 * the next formula: Each element will contain the value of summing the row
	 * index and column index, and we multiply the result by 10. And we'll print the
	 * array already modified in the terminal.
	 */

	public static void main(String[] args) {

		// We create the array in question.
		int[][] table = new int[4][5];
		
		ArrayFiller.fillRowsOfArrayWithIndex(table);

		// Function to print the values of the array
		for (int[] fila : table) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		

	}

}
