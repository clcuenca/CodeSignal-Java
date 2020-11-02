/// CodeSignal - Intro - Edge of the Ocean
/// Adjacent Elements Product
/// Author: Carlos L. Cuenca
/// Date: 11/2/2020

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
			int[] numbers = Arrays.stream(reader.readLine().trim().split(" ")
				.mapToInt(Integer::parseInt).toArray());

			System.out.println(adjacentElementsProduct(numbers));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	int adjacentElementsProduct(int[] inputArray) {

		int maximum = -999999999;

		for(int index = 0; index < inputArray.length - 1; index++){

			maximum = Math.max(maximum, inputArray[index] * inputArray[index + 1]);

		}

		return maximum;

	}

}


