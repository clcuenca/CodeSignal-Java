/// CodeSignal - Intro - Island of Knowledge
/// Avoid Obstacles
/// Author: Carlos L. Cuenca
/// Date: 02/08/2021

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

public class AvoidObstacles {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int   size    = Integer.parseInt(reader.readLine());

			int[] numbers = new int[size];

			String[] input = reader.readLine().trim().split("\\s+");

			for(int index = 0; index < size; index++)
				numbers[index] = Integer.parseInt(input[index]);

			System.out.println(avoidObstacles(numbers));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int avoidObstacles(int[] array) {

		int multiple = 2;
		int index    = 0;

		while(index < array.length) {

			if(array[index] % multiple == 0) {

				multiple++;

				index = -1;

			}

			index++;

		}

		return multiple;

	}

}


