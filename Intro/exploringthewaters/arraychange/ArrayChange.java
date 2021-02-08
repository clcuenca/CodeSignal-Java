/// CodeSignal - Intro - Exploring the Waters
/// Array Change
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

public class ArrayChange {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int size = Integer.parseInt(reader.readLine());

			int[] inputArray = new int[size];

			String[] numbers = reader.readLine().split("\\s+");

			for(int index = 0; index < size; index++)
				inputArray[index] = Integer.parseInt(numbers[index]);

			System.out.println(arrayChange(inputArray));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int arrayChange(int[] inputArray) {

		int difference = 0;
		int moves      = 0;

		for(int index = 0; index < inputArray.length - 1; index++) {

			if(inputArray[index] >= inputArray[index + 1]) {

				difference = inputArray[index] - inputArray[index + 1];

				moves += difference + 1;

				inputArray[index + 1] += difference + 1;

			}


		}

		return moves;

	}

}


