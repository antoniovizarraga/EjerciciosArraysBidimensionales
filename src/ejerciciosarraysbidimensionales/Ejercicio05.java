package ejerciciosarraysbidimensionales;

import java.util.Random;
import java.util.Arrays;

public class Ejercicio05 {
	
	
	public static int[][] randomArray() {
		int[][] table = new int[4][5];
		
		Random rand = new Random();
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[0].length; j++) {
				table[i][j] = rand.nextInt(100, 1000);
			}
		}
		
		return table;
	}

	public static void main(String[] args) {
		
		
		int[][] table = new int[4][5];
		
		table = Arrays.copyOf(randomArray(), 4);
		
		int sumaFilas = 0;
		int sumaColumnas = 0;
		int sumaTotal = 0;
		
		
		//table[3][4] = result;
		
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
		
		for(int j = 0; j < table[0].length; j++ ) {
			for(int i = 0; i < table.length; i++) {
				sumaColumnas += table[i][j];
			}
			System.out.print(sumaColumnas + "\t");
			sumaColumnas = 0;
		}
		
		System.out.print("Suma total: " + sumaTotal);
		
		
	}

}
