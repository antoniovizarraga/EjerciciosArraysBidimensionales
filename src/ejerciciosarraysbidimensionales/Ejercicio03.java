package ejerciciosarraysbidimensionales;

public class Ejercicio03 {

	/*
	 * We're going to create a program that will fill an Array with values following
	 * the next formula: Each element will contain the value of summing the row
	 * index and column index, and we multiply the result by 10. And we'll print the
	 * array already modified in the terminal.
	 */

	// We are going to start with creating a function to fill the Array.
	private static void arrayFiller(int[][] table) {
		
		/* This will be the variable that indicates to the for loop in which row
		 * the program will be writing a value. */
		int rowIndex = 0;

		do {
			/*
			 * Execute this code same times as how many elements there are stored in the
			 * second dimension of the Array. Same as before, we start in the second
			 * position, because the first positions of every row contains the Student's
			 * names.
			 */
			for (int i = 0; i <= table.length; i++) {
				table[rowIndex][i] = (rowIndex + i) * 10;
			}
			// We sum 1 to the variable to change the row. Otherwise, the loop would never
			// finish.
			rowIndex++;
		} while (rowIndex != table.length);

		// Function to print the values of the array
		for (int[] fila : table) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// We create the array in question.
		int[][] table = new int[4][5];
		
		// And finally we call the function.
		arrayFiller(table);

	}

}
