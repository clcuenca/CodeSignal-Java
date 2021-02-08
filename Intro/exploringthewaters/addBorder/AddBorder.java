/// CodeSignal - Intro - Exploring the Waters
/// Add Border
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

public class AddBorder {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int size = Integer.parseInt(reader.readLine());

			String[] input = new String[size];

			for(int index = 0; index < size; index++)
				input[index] = reader.readLine();

			String[] borderPicture = addBorder(input);

			for(int index = 0; index < borderPicture.length; index++)
				System.out.println(borderPicture[index]);

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static String[] addBorder(String[] picture) {
	    
	    String[] borderPicture = new String[picture.length + 2];
	    
	    for(int index = 0; index < borderPicture.length; index++)
	        borderPicture[index] = "";
	    
	    for(int index = 0; index < picture[0].length() + 2; index++)
	        borderPicture[0] += '*';
	        
	    for(int row = 0; row < picture.length; row++) {
	        
	        for(int column = -1; column <= picture[row].length(); column++) {
	            
	            if(column == -1 || column == picture[row].length()) {
	                
	                borderPicture[row + 1] += '*';
	                
	            } else {
	                
	                borderPicture[row + 1] += picture[row].charAt(column);
	                
	            }
	            
	        }
	        
	    }
	    
	    for(int index = 0; index < picture[0].length() + 2; index++)
	        borderPicture[borderPicture.length - 1] += '*';
	        
	    return borderPicture;

	}

}


