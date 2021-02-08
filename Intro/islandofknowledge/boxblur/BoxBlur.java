/// CodeSignal - Intro - Island of Knowledge
/// Box Blur
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

public class BoxBlur {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			String[] area = reader.readLine().trim().split("\\s+");

			int rows    = Integer.parseInt(area[0]);
			int columns = Integer.parseInt(area[1]);

			int[][] image = new int[rows][columns];

			for(int row = 0; row < image.length; row++) {

				int[] line = Arrays.stream(reader.readLine().trim().split(" "))
				.mapToInt(Integer::parseInt).toArray();

				for(int column = 0; column < image[row].length; column++)
					image[row][column] = line[column];

			}

			int[][] blurred = boxBlur(image);

			for(int row = 0; row < blurred.length; row++) {

				for(int column = 0; column < blurred[row].length; column++) {

					System.out.print(String.valueOf(blurred[row][column]) + " ");

				}

				System.out.println("");

			}

			System.out.println("");

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int[][] boxBlur(int[][] image) {

		int[][] matrix = new int[image.length - 2][image[0].length - 2];

		for(int row = 1; row < image.length - 1; row++) {

			for(int column = 1; column < image[row].length - 1; column++) {


				matrix[row - 1][column - 1] = (image[row - 1][column - 1] + image[row - 1][column] + image[row - 1][column + 1] +
											   image[row][column - 1]     + image[row][column] + image[row][column + 1] +
											   image[row + 1][column - 1] + image[row + 1][column] + image[row + 1][column + 1]) / 9; 

			}

		}

		return matrix;

	}

}


