/// CodeSignal - Intro - Edge of the Ocean
/// Matrix Elements Sum
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

public class MatrixElementsSum {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int rows = Integer.parseInt(reader.readLine());

			int[][] matrix = new int[rows][];

			for(int index = 0; index < rows; index++) {
				
				int[] row = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

				matrix[index] = row;

			}

			System.out.println(matrixElementsSum(matrix));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int matrixElementsSum(int[][] matrix) {

		int sum = 0;
		boolean[] notHaunted = new boolean[matrix[0].length];

		for(int index = 0; index < notHaunted.length; index++)
			notHaunted[index] = true;

		for(int row = 0; row < matrix.length; row++)
			for(int column = 0; column < matrix[row].length; column++) {

				notHaunted[column] = notHaunted[column] && matrix[row][column] != 0;

				if(notHaunted[column]) sum += matrix[row][column];

			}


		return sum;

	}

}


