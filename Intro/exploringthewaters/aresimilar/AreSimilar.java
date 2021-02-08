/// CodeSignal - Intro - Exploring the Waters
/// Are Similar?
/// Author: Carlos L. Cuenca
/// Date: 02/07/2021

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Stack;

/// --------------
/// Driver Program

public class AreSimilar {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int arraySize = Integer.parseInt(reader.readLine());

			int[] arrayA = new int[arraySize];
			int[] arrayB = new int[arraySize];

			String[] numbers = reader.readLine().trim().split("\\s+");

			for(int index = 0; index < arraySize; index++)
				arrayA[index] = Integer.parseInt(numbers[index]);

			numbers = reader.readLine().trim().split("\\s+");

			for(int index = 0; index < arraySize; index++)
				arrayB[index] = Integer.parseInt(numbers[index]);

			System.out.println(areSimilar(arrayA, arrayB));

			inputCount--;

		}

	}

	/// -------
	/// Classes

	public static class Pair<K, V> {

		public K first;
		public V second;

		public Pair(K first, V second) {

			this.first  = first  ;
			this.second = second ;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static boolean areSimilar(int[] arrayA, int[] arrayB) {

		final Stack pairs = new Stack();

		for(int index = 0; index < arrayA.length; index++)
			if(arrayA[index] != arrayB[index]) pairs.push(new Pair(arrayA[index], arrayB[index]));

		boolean canSwap = (pairs.size() == 0);

		while(pairs.size() == 2) {

			final Pair<Integer, Integer> top = ((Pair<Integer, Integer>) pairs.peek());

			pairs.pop();
            
            final Pair<Integer, Integer> bottom = ((Pair<Integer, Integer>) pairs.peek());
            // Don't judge me, java was doing some backwards things
			canSwap = (String.valueOf(top.first).equals(String.valueOf(bottom.second))) &&
				(String.valueOf(top.second).equals(String.valueOf(bottom.first)));

		}

		return canSwap;
    
	}

}


