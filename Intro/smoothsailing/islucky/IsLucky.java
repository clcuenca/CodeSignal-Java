/// CodeSignal - Intro - Edge of the Ocean
/// Is Lucky
/// Author: Carlos L. Cuenca
/// Date: 11/3/2020

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class IsLucky {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int number = Integer.parseInt(reader.readLine());

			System.out.println(isLucky(number));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static boolean isLucky(int number) {

		int firstSum  = 0      ;
		int secondSum = 0      ;
		int digits    = 0      ;
		int copy      = number ;

		while(copy > 0) { digits++; copy /= 10; }

		for(int index = 0; index < digits; index++) {

			if(index < digits / 2) secondSum += (number % 10);
			else 				   firstSum  += (number % 10);

			number /= 10;

		}

		return firstSum == secondSum;

	}

}


