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

		int rowIndex = 1;
		

		String[][] table = new String[STUDENTS + 1][SUBJECTS + 1];

		for (int i = 0; i < STUDENTS; i++) {
			table[i + 1][0] = "Student " + (i + 1);
		}

		/*
		 * We sum 1 to the dimensions of the array because the idea I have in mind is
		 * printing in the first column the names of the students (Student 1, student
		 * 2...) and the first row will have the names of the subjects. For example:
		 * 
		 * Math Computer Engineering Databases Student 1 7 8 6 Student 2 5 9 7
		 * 
		 * And that's why we need 1 extra column and another 1 extra row.
		 *
		 */

		for (int i = 0; i < SUBJECTS; i++) {
			table[0][i + 1] = "Subject " + (i + 1);
		}

		// We insert anything to actually be able to print white space instead of:
		// "Null".
		table[0][0] = "";

		for (int i = 0; i < SUBJECTS; i++) {
			table[rowIndex][i + 1] = GetValue.getString("What grade has Student " + (i + 1) + "?");
		}

		// Function to print the values of the array
		for (String[] row : table) {
			for (String value : row) {
				System.out.printf("%-10s\t", value);
			}
			System.out.println();
		}
		
		GetValue.SCANNER.close();

	}

}
