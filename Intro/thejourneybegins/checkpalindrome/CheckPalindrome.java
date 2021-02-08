/// CodeSignal - Intro - The Journey Begins
/// Check Palindrome
/// Author: Carlos L. Cuenca
/// Date: 10/05/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/// --------------
/// Driver Program

public class CheckPalindrome {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			System.out.println(checkPalindrome(reader.readLine()));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static boolean checkPalindrome(String inputString) {

		for(int index = 0; index < inputString.length(); index++) {

			if(inputString.charAt(index) != inputString.charAt(inputString.length() - index - 1)) {

				return false;

			}

		}

		return true;

	}

}


