/// CodeSignal - Intro - Exploring the Waters
/// Palindrome Rearranging
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

/// --------------
/// Driver Program

public class PalindromeRearranging {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			String line = reader.readLine();

			System.out.println(palindromeRearranging(line));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static boolean palindromeRearranging(String inputString) {
	    
	    int[] map = new int[26];
	    int fault = 0;
	    
	    for(int index = 0; index < map.length; index++)
	        map[index] = 0;
	        
	    for(int index = 0; index < inputString.length(); index++)
	        map[inputString.charAt(index) - 'a'] += 1;
	        
	    for(int index = 0; index < map.length; index++) {
	        
	        if(map[index] % 2 != 0) fault++;
	        
	        if(fault > 1) break;
	        
	    }
	    
	    return fault <= 1;

	}

}


