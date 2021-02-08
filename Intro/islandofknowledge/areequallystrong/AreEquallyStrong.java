/// CodeSignal - Intro - Island of Knowledge
/// Are Equally Strong
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

public class AreEquallyStrong {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			String[] input = reader.readLine().trim().split("\\s+");

			int[] numbers = new int[input.length];

			for(int index = 0; index < numbers.length; index++)
				numbers[index] = Integer.parseInt(input[index]);

			System.out.println(areEquallyStrong(numbers[0], numbers[1], numbers[2], numbers[3]));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

		return ((yourLeft == friendsRight) || (yourLeft == friendsLeft)) &&
			((yourRight == friendsLeft) || (yourRight == friendsRight));

	}

}


