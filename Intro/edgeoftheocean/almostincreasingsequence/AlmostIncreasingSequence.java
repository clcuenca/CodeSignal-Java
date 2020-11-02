/// CodeSignal - Intro - Edge of the Ocean
/// Almost Increasing Sequence
/// Author: Carlos L. Cuenca
/// Date: 11/2/2020

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class AlmostIncreasingSequence {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int[] sequence = Arrays.stream(reader.readLine().trim().split(" "))
				.mapToInt(Integer::parseInt).toArray();

			System.out.println(almostIncreasingSequence(sequence));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static boolean almostIncreasingSequence(int[] sequence) {

		int count    = 0;
		int position = 0;

		for(int index = 0; index < sequence.length - 1; index++) {
			
			if(sequence[index] >= sequence[index + 1]) {

				count++;

				position = index;

			}

		}

		boolean atBoundary = (position == 0) || position >= sequence.length - 2;

		if(!atBoundary) atBoundary = sequence[position - 1] < sequence[position + 1] || sequence[position] < sequence[position + 2];

		return (count <= 1) && atBoundary;

	}

}


