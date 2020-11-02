/// CodeSignal - Intro - The Journey Begins
/// add
/// Author: Carlos L. Cuenca
/// Date: 10/05/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/// --------------
/// Driver Program

public class Add {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;
		int parameter1;
		int parameter2;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			// This is a multi-line input
			String line = reader.readLine();
			String[] numbers = line.trim().split("\\s+");

			parameter1 = Integer.parseInt(numbers[0]);
			parameter2 = Integer.parseInt(numbers[1]);

			System.out.println(add(parameter1, parameter2));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int add(int param1, int param2) {

		return param1 + param2;

	}

}


