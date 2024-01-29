package ejerciciosarraysbidimensionales;

public class Ejercicio02 {

	/* We will be making a program that creates a bidimensional array
	 * with 4 rows and 5 columns (4 students and 5 subjects).
	 * The user will write the related grades (For each student
	 * maybe?), and the program will show the array with
	 * the grades already typed by the user, followed by
	 * the minimum, maximum and the average grade of the
	 * student. */
	public static void main(String[] args) {
		
		final int STUDENTS = 4;
		final int SUBJECTS = 5;
		
	   
		String[][] table = new String[STUDENTS + 1][SUBJECTS + 1];
		
		/* We sum 1 to the dimensions of the array because the idea I
		*  have in mind is printing in the first column the names
		*  of the students (Student 1, student 2...) and the
		*  first row will have the names of the subjects.
		*  For example:
		*  
		*  		 	 Math	Computer Engineering	Databases
		*  Student 1	7			8					6
		*  Student 2	5			9					7
		*   
		*  And that's why we need 1 extra column and another 1 extra
		*  row.   
		*
		*/

		for(int i = 0; i < STUDENTS; i++) {
			table[i + 1][0] = "Student " + (i + 1);
		}
		
		for (String[] fila : table) {
			for (String valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
	}

}
