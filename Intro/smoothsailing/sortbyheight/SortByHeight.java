/// CodeSignal - Intro - Edge of the Ocean
/// Sort By Height
/// Author: Carlos L. Cuenca
/// Date: 11/3/2020

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

public class SortByHeight {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int[] array = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

			array = sortByHeight(array);

			for(int index = 0; index < array.length; index++) {

				System.out.print(String.valueOf(array[index]) + " ");

			}

			System.out.println(" ");

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int[] sortByHeight(int[] array) {

		ArrayList<Integer> people = new ArrayList<>();

		for(int index = 0; index < array.length; index++) 
			if(array[index] != -1) people.add(array[index]);

		Collections.sort(people);

		int current = 0;

		for(int index = 0; index < array.length; index++) {

			if(array[index] != -1) {

				array[index] = people.get(current).intValue();

				current++;
			}

		}

		return array;

	}

}


