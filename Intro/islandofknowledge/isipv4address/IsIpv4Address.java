/// CodeSignal - Intro - Island of Knowledge
/// IsIpv4Address
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
import java.util.Stack;

/// --------------
/// Driver Program

public class IsIpv4Address {

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

			System.out.println(isIPv4Address(line));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static boolean isIPv4Address(String string) {
    
		final Stack<String> strings = new Stack();
		int                 last    = 0;
		boolean             isAddress;

		for(int index = 0; index < string.length(); index++) {

			if(string.charAt(index) == '.') {

				if(last > 0) last += 1;
                
				strings.push(string.substring(last, index));
                
				last = index;
            
			}

			if(index == string.length() - 1) {
                
                if(last + 1 <= index) {
                
                    strings.push(string.substring(last + 1, index + 1));
                
                }
                
			}

		}

		isAddress = (strings.size() == 4);

		while(strings.size() > 0 && isAddress) {

			String number = strings.peek();

			strings.pop();

			isAddress = isAddress && (number.length() > 0 && number.length() <= 3);

			for(int index = 0; index < number.length(); index++) {

				isAddress = (isAddress && (number.charAt(index) >= '0' && number.charAt(index) <= '9'));
				isAddress = (isAddress && !(number.charAt(0) == '0' && number.length() > 1));

			}

			if(!isAddress) break;

			isAddress = (isAddress && (Integer.parseInt(number) >= 0 && Integer.parseInt(number) <= 255));

		}


		return isAddress;

	}

}


