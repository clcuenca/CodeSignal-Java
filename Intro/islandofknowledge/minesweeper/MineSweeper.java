/// CodeSignal - Intro - Island of Knowledge
/// MineSweeper
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

public class MineSweeper {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int[] area = Arrays.stream(reader.readLine().trim().split(" "))
				.mapToInt(Integer::parseInt).toArray();

			int rows    = area[0];
			int columns = area[1];

			boolean[][] board = new boolean[rows][columns];

			for(int row = 0; row < board.length; row++) {

				String[] line = reader.readLine().trim().split("\\s+");

				for(int column = 0; column < line.length; column++)
					board[row][column] = (Integer.parseInt(line[column]) == 1);

			}

			int[][] answer = mineSweeper(board);

			for(int row = 0; row < answer.length; row++) {

				for(int column = 0; column < answer[row].length; column++) {

					System.out.print(String.valueOf(answer[row][column]) + " ");

				}

				System.out.println("");

			}

			System.out.println("");

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int[][] mineSweeper(boolean[][] board) {

		int[][] answer = new int[board.length][board[0].length];

		for(int row = 0; row < board.length; row++) {

			for(int column = 0; column < board[row].length; column++) {

				int buffer = 0;

				if((row - 1 >= 0) && (column - 1 >= 0) && board[row - 1][column - 1]) buffer += 1;
				if((row - 1 >= 0) && board[row - 1][column]) buffer += 1;
				if((row - 1 >= 0) && (column + 1 < board[row].length) && board[row - 1][column + 1]) buffer += 1;
				if((column - 1 >= 0) && board[row][column - 1]) buffer += 1;
				if((column + 1 < board[row].length) && board[row][column + 1]) buffer += 1;
				if((row + 1 < board.length) && (column - 1 >= 0) && board[row + 1][column - 1]) buffer += 1;
				if((row + 1 < board.length) && board[row + 1][column]) buffer += 1;
				if((row + 1 < board.length) && (column + 1 < board[row + 1].length) && board[row + 1][column + 1]) buffer += 1;

				answer[row][column] = buffer;

			}

		}

		return answer;

	}



}


