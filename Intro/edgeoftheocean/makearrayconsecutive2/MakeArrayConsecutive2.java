/// CodeSignal - Intro - Edge of the Ocean
/// Make Array Consecutive 2
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

public class MakeArrayConsecutive2 {

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
			int[] array = Arrays.stream(reader.readLine().trim().split(" "))
				.mapToInt(Integer::parseInt).toArray();

			System.out.println(makeArrayConsecutive2(array));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int makeArrayConsecutive2(int[] statues) {

		int steps = 0;
        
        Arrays.sort(statues, 0, statues.length);

		for(int index = 1; index < statues.length; index++) {

			steps += statues[index] - statues[index - 1] - 1;

		}

		return steps;

	}

}


