package ejerciciosarraysbidimensionales;

public class Ejercicio01 {

	/*
	 * Vamos a crear un programa en el que crearemos un array bidimensional en el
	 * que al insertar valores en ciertas posiciones concretas, luego seamos capaces
	 * de representar todos los valores del array como si fuera una tabla con filas
	 * y columnas.
	 */
	public static void main(String[] args) {
		// Creamos el array bidimensional.
		int num[][];

		// Dicho array tendrá 3 filas y 6 columnas.
		num = new int[3][6];

		// Insertamos los valores ciertas posiciones concretas
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Creamos el bucle encargado de imprimir por pantalla los valores del array.
		for (int[] fila : num) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

	}

}
