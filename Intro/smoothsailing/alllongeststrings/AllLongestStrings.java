/// CodeSignal - Intro - Smooth Sailing
/// All Longest Strings
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

public class AllLongestStrings {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int arrayCount = Integer.parseInt(reader.readLine());

			String[] array = new String[arrayCount];

			for(int index = 0; index < arrayCount; index++) {

				array[index] = reader.readLine();

			}

			array = allLongestStrings(array);

			for(int index = 0; index < array.length; index++)
				System.out.println(array[index]);

			System.out.println(" ");


			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static String[] allLongestStrings(String[] inputArray) {

		ArrayList<String> strings = new ArrayList<String>();
		int maximum = 0;

		for(int index = 0; index < inputArray.length; index++) {

			if(inputArray[index].length() > maximum) {

				maximum = inputArray[index].length();

				strings.clear();

				strings.add(inputArray[index]);

			} else if(inputArray[index].length() == maximum) {

				strings.add(inputArray[index]);

			}


		}

	    String[] returnArray = new String[strings.size()];

	    for(int index = 0; index < strings.size(); index++)
	        returnArray[index] = strings.get(index);

		return returnArray;

	}

}


