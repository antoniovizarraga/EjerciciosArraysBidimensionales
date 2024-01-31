package ejerciciosarraysbidimensionales;

public class ArrayFiller {
	public static void fillRowsOfArrayWithValue(int[][] table, int value) {
		for(int j = 0; j < table.length; j++) {
			for(int i = 0; i < table[0].length; i++) {
				table[i][j] = value;
			}		
		}
	}
	
	public static void fillRowsOfArrayWithIndex(int[][] table) {
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[0].length; j++) {
				table[i][j] = (10 * i) + j;
			}		
		}
	}
}
