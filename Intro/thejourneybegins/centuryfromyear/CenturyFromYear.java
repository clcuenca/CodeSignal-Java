/// CodeSignal - Intro - The Journey Begins
/// Century From Year
/// Author: Carlos L. Cuenca
/// Date: 10/05/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/// --------------
/// Driver Program

public class CenturyFromYear {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			System.out.println(centuryFromYear(Integer.parseInt(reader.readLine())));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int centuryFromYear(int year) {

		int century = year / 100;

		if (year % 100 != 0) { 

			century++;

		}

		return century;

	}

}


