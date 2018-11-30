/*
 * This class tests if a given string is a palindrome.
 *  
 * @author Alisa Levin and Edson Zandamela
 * @version 1.1, 02/21/2018
 * @see java.io.InputStreamReader
 * @see java.io.BufferedReader
 * @see String
 */

import java.io.*;

public class Palindrome {

  /**
   * isPalindrome() returns true if a string s is a palindrome.
   */
  public static boolean isPalindrome(String s) {
    return s.equals(reverse(s));
  } // isPalindrome()

  /** 
   * reverse() returns a string s in the reverse order.
   * @param s - a string
   * @return t - the reversed string 
   */
  public static String reverse(String s) {
    // Complete this method.
    String t = null;  
    if (s.length() > 1) {
        char v = s.charAt(0);
        t = reverse(s.substring(1)) + v;
    } 
    else if (s.length() == 1) {
        t = s;
    }
    return t;
  } //reverse()

  /**
   * main() tests the isPalindrome() method.
   */
  public static void main(String argv[]) throws IOException
  {
    BufferedReader input = new BufferedReader
      (new InputStreamReader(System.in));
    String inputString;

    System.out.print("Input a string: ");
    inputString = input.readLine();

    if (isPalindrome(inputString))
      System.out.println(inputString + " is a palindrome.");
    else
      System.out.println(inputString + " is a not palindrome.");
  } // main()

} // Palindrome
