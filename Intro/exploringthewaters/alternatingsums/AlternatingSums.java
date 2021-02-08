/// CodeSignal - Intro - Exploring the Waters
/// Alternating Sums
/// Author: Carlos L. Cuenca
/// Date: 02/07/2021

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;

/// --------------
/// Driver Program

public class AlternatingSums {

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
			String   line    = reader.readLine();
			String[] strings = reader.readLine().trim().split("\\s+");

			int   number  = Integer.parseInt(line);
			int[] numbers = new int[number];

			for(int index = 0; index < number; index++)
				numbers[index] = Integer.parseInt(strings[index]);

			int[] array = alternatingSums(numbers);

			System.out.println(array[0] + " " + array[1]);

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int[] alternatingSums(int[] array) {

		int[] returnArray = new int[2];

		returnArray[0] = 0;
		returnArray[1] = 0;

		for(int index = 0; index < array.length; index++) {

			if((index % 2) == 0) returnArray[0] += array[index];
			else 				 returnArray[1] += array[index];

		}

		return returnArray;

	}

}


