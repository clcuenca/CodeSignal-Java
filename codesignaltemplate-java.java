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

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			// This is a multi-line input
			String line = reader.readLine();
			String[] numbers = line.trim().split("\\s+");

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

}


