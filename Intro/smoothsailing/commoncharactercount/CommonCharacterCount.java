/// CodeSignal - Intro - Edge of the Ocean
/// Common Character Count
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

public class CommonCharacterCount {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			String string1 = reader.readLine();
			String string2 = reader.readLine();

			System.out.println(commonCharacterCount(string1, string2));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int commonCharacterCount(String s1, String s2) {
	    
	    int[] hash1 = new int[26];
	    int[] hash2 = new int[26];
	    int shared = 0;
	    
	    for(int index = 0; index < s1.length(); index++)
	        hash1[s1.charAt(index) - 'a']++;
	        
	    for(int index = 0; index < s2.length(); index++)
	        hash2[s2.charAt(index) - 'a']++;
	        
	    for(int index = 0; index < 26; index++)
	        shared += Math.min(hash1[index], hash2[index]);
	    
	    return shared;

	}


}


