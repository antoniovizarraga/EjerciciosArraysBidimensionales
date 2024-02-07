package ejerciciosarraysbidimensionales;

/**
 * Vamos a crear el ejercicio el cual, dado un Array bidimensional con unos valores,
 * devuelva con una función un Array bidimensional igual que el original pero
 * transponiéndolo (Es decir, intercambiar filas por columnas).
 */
public class Ejercicio07 {

	/**
	 * Función en la que transpondremos el Array recibido como parámetro.
	 * @param table Array que contiene los valores a transponer.
	 * @return transpositionArray Devuelve el Array ya transpuesto.
	 */
	public static int[][] transpositionOfArray (int[][] table) {
        // Creamos un nuevo Array para almacenar la transposición
        int[][] transpositionArray = new int[table.length][table[0].length];

        // Iteramos sobre las filas y columnas del nuevo Array creado
        for(int i = 0; i < transpositionArray.length; i++) {
            for(int j = 0; j < transpositionArray[0].length; j++) {
                // Intercambiamos las filas por las columnas
                transpositionArray[j][i] = table[i][j];
            }
        }

        // Devolvemos el Array transpuesto
        return transpositionArray;
    }
    
    public static void main(String[] args) {
        // Variable auxiliar para llenar el Array que crearemos con valores
        int aux = 0;
        
        // Creamos un Array bidimensional de 4x4
        int[][] table = new int [4][4];
        
        // Llenamos el Array original con valores consecutivos
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[0].length; j++) {
                aux++;
                table[i][j] = aux;
            }
        }
        
        // Transponemos el Array original llamando a la función transpositionOfArray
        table = transpositionOfArray(table);
        
        // Imprimimos el Array transpuesto
        for (int[] fila : table) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

}
