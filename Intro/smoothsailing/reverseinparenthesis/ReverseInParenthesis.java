/// CodeSignal - Intro - Smooth Sailing
/// ReverseInParenthesis
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

public class ReverseInParenthesis {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		ReverseInParenthesis reverseInParenthesis = new ReverseInParenthesis();

		while(inputCount != 0) {

			String line = reader.readLine();

			System.out.println(reverseInParenthesis.reverseInParenthesis(line));

			inputCount--;

		}

	}

	public class Pair<K, V> {

		public final K first  ;
		public final V second ;

		public Pair(K first, V second) {

			this.first  = first  ;
			this.second = second ;

		}

	}

	public String reverse(String string) {

		byte[] byteArray = string.getBytes();
		byte[] result    = new byte[byteArray.length];

		for(int index = 0; index < byteArray.length; index++)
			result[index] = byteArray[byteArray.length - index - 1];

		return new String(result);

	}

	/// ------------------------
	/// Function Implementations

	public String reverseInParenthesis(String inputString) {

		final Stack stack = new Stack();
		String workString = inputString;

		for(int index = 0; index < workString.length(); index++) {

			if(workString.charAt(index) == '(') stack.push(new Pair<>(index, -1));

			if(workString.charAt(index) == ')') {

				final Pair<Integer, Integer> pair = new Pair(((Pair<Integer, Integer>) stack.peek()).first, index);

				stack.pop();

				workString = workString.substring(0, pair.first) +
					reverse(workString.substring(pair.first, pair.second)) +
					workString.substring(pair.second);

			}

		}

		String returnString = "";

		for(int index = 0; index < workString.length(); index++) {

			if(workString.charAt(index) != '(' && workString.charAt(index) != ')')
				returnString += workString.charAt(index);

		}

		return returnString;

	}

}


