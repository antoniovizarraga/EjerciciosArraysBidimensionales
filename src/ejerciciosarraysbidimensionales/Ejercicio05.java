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
		
		int result = 0;
		int result2 = 0;
		int result3 = 0;
		
		for(int[] fila : table) {
			for (int valor: fila) {
				
			}
		}
		
		//table[3][4] = result;
		
		for (int[] fila : table) {
			for (int valor : fila) {
				result += valor;
				result2 += valor;
				System.out.print(valor + "\t");
			}
			System.out.print("Suma Fila " + result);
			result = 0;
			System.out.println();
		}
		
		for(int i = 0; i < table.length; i++ ) {
			for(int j = 0; j < table[0].length; j++) {
				result3 += table[i][j];
			}
		}
		
		
	}

}
