/**
 * This class converts a binary string to its corresponding decimal value.
 *  
 * @author Alisa Levin and Edson Zandamela
 * @version 1.1, 02/21/2018
 * @see java.io.InputStreamReader
 * @see java.io.BufferedReader
 * @see String
 */

import java.io.*;

public class BDConverter {

  /**
   * binToDecimal() returns the decimal value of a binary string s.
   * @param s - a string
   * @return i - the reversed integer
   */
  public static int binToDecimal(String s) {
    // Complete this method.
    int i = 0; 
    if (s.length() > 1) {
        int n = s.length();
        String x = s.substring(0, n-1);
        String y = Character.toString(s.charAt(n-1));
        i = 2 * binToDecimal(x) + Integer.parseInt(y);
    }
    else if (s.length() == 1) {
       i =  Integer.parseInt(s);
    }
    return i; 
  } // binToDecimal()

  /**
   * main() tests the correctness of binToDecimal() by printing out the 
   * decimal value of a given binary string.
   */
  public static void main(String argv[]) throws IOException
  {
    BufferedReader input = new BufferedReader
      (new InputStreamReader(System.in));
    String inputString;

    System.out.print("Input a binary number: ");
    inputString = input.readLine();

    System.out.println("The value of " + inputString + " in decimal is " + binToDecimal(inputString) + ".");
  } // main()

}// Converter
