# Intro - The Journey Begins - Check Palindrome

A solution to Codesignal's 'checkPalindrome' problem.
To build: ```~$ javac CheckPalindrome.java```

To run with the provided input file: ```~$ java CheckPalindrome < input.txt```

### Adding Java to the PATH variable

#### Windows

Using Cygwin, ```export PATH=$PATH:"/cygdrive/C/Program Files/Java/<jdk version folder>/bin/"```

## Example

* For ```inputString = "aabaa"```, the output should be
```checkPalindrome(inputString) = true```;

* For ```inputString = "abac"```, the output should be
```checkPalindrome(inputString) = false```;

* For ```inputString = "a"```, the output should be
```checkPalindrome(inputString) = true```.

## Input/Output

* **[execution time limit] 0.5 seconds (cpp)**

* **[input] string inputString**

A non-empty string consisting of lowercase characters.

*Guaranteed constraints:*
```1 ≤ inputString.length ≤ 105```.

* **[output] boolean**

```true``` if inputString is a palindrome, ```false``` otherwise.
