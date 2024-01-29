package ejerciciosarraysbidimensionales;

import java.util.Scanner;
import java.util.InputMismatchException;

/* We're going to define a class to use it in all of the exercises. The idea behind this
 * is that we'll be asking the user to write a value and return it following the try-catch
 * method and the do-while loop. We will be making functions for 3 data types:
 * Strings, integers, and doubles. Which they are the main ones we actually
 * use in class. */
public class getValue {

	// We start making the Integer function.
	public static int getInteger() {

		// We create the Scanner object.
		Scanner sc = new Scanner(System.in);

		// We create the variable which we'll be using for
		// returning it later and also will be the
		// condition on the do-while loop.
		int returnValue = 0;

		// We make the do-while loop first, and then the
		// try-catch code block.
		do {
			try {
				// Ask the user for a value
				System.out.println("Introduzca un valor: ");

				// And we open the Scanner
				returnValue = sc.nextInt();

				// If the value throws a InputMismatchException error,
			} catch (InputMismatchException e) {
				// Clean the Scanner buffer just in case
				sc.nextLine();

				// Print the error in the terminal
				System.err.println("ERROR: Has introducido un valor que no es un número entero. Vuelve a intentarlo.");
			}

			// And we're going to make this any time until the user writes the correct
			// value.
		} while (returnValue == 0);

		// We close the Scanner.
		sc.close();

		// And finally, return the value.
		return returnValue;
	}

	
	// This is just the same function as before, but with Doubles.
	public static double getDouble() {
		Scanner sc = new Scanner(System.in);

		double returnValue = 0;

		do {
			try {
				System.out.println("Introduzca un valor: ");
				returnValue = sc.nextDouble();

			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("ERROR: Has introducido un valor que no es un número entero. Vuelve a intentarlo.");
			}

		} while (returnValue == 0);

		sc.close();

		return returnValue;
	}

	/*
	 * And the same for Strings. Though this is different because Strings just
	 * accepts any character as a String, so the InputMismatchException here is
	 * useless.
	 */
	public static String getString() {
		Scanner sc = new Scanner(System.in);

		String returnValue = "";

		System.out.println("Introduzca un valor: ");
		returnValue = sc.nextLine();

		sc.close();

		return returnValue;
	}

}
