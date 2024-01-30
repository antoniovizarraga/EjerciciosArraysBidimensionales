package ejerciciosarraysbidimensionales;

public class Ejercicio02 {

	/*
	 * We will be making a program that creates a bidimensional array with 4 rows
	 * and 5 columns (4 students and 5 subjects). The user will write the related
	 * grades (For each student maybe?), and the program will show the array with
	 * the grades already typed by the user, followed by the minimum, maximum and
	 * the average grade of the student.
	 */

	public static final int STUDENTS = 4;
	public static final int SUBJECTS = 5;

	public static void main(String[] args) {

		/* This will be the variable that indicates to the for loop in which row
		 * the program will be writing a value. */
		int rowIndex = 1;

		/* This is the Array. The reason why we sum 1 to the rows and columns
		 * of the Array are explained below. */
		String[][] table = new String[STUDENTS + 1][SUBJECTS + 1];

		// This will write the names of the students (Student 1, Student 2...).
		for (int i = 0; i < STUDENTS; i++) {
			table[i + 1][0] = "Student " + (i + 1);
		}

		/*
		 * We sum 1 to the dimensions of the array because the idea I have in mind is
		 * printing in the first column the names of the students (Student 1, student
		 * 2...) and the first row will have the names of the subjects. For example:
		 * 
		 *			 		Math	Computer Engineering	Databases
		 * Student 1		5				7					4
		 * Student 2		7				8					6
		 * Student 3 		9				8					7
		 * 
		 * 
		 * And that's why we need 1 extra column and another 1 extra row.
		 *
		 */

		// We first add the subjects to the Array. We sum 1 to start from the second position.
		/* We're doing this to basically not writing anything on the first position of the
		 * Array. Later, when the table prints out, you'll understand soon enough. */
		for (int i = 0; i < SUBJECTS; i++) {
			table[0][i + 1] = "Subject " + (i + 1);
		}

		// We insert nothing to actually be able to print white space instead of:
		// "Null".
		table[0][0] = "";

		/* Do a loop until the rowIndex reaches 5 (Which the code will execute 5 times).
		 * I think this loop can be replaced by a for loop, but yeah, using a do-while
		 * was my initial idea. So... */
		do {
			/* Execute this code same times as how many elements there are stored
			 * in the second dimension of the Array. Same as before, we start in
			 * the second position, because the first positions of every row
			 * contains the Student's names. */
			for (int i = 0; i < SUBJECTS; i++) {
				table[rowIndex][i + 1] = GetValue.getString("What grade has Student " +
				(rowIndex) + " in Subject " + (i + 1) + "?");
			}
			// We sum 1 to the variable to change the row. Otherwise, the loop would never finish.
			rowIndex++;
		} while (rowIndex != 5);

		// Function to print the values of the array
		for (String[] row : table) {
			for (String value : row) {
				System.out.printf("%-10s\t", value);
			}
			System.out.println();
		}

		// We close the Scanner.
		GetValue.SCANNER.close();

	}

}
