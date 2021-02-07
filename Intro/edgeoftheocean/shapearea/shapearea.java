/// CodeSignal - Intro - Edge of the Ocean
/// Shape Area
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

public class ShapeArea {

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

			System.out.println(shapeArea(number));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int shapeArea(int n) {

		int area = 1;

		for(int index = 1; index <= n; index++) {

			area += 4*(n - index);

		}

		return area;

	}

}


