/**
 * This program is a cryptography program that takes the basic idea of Caesar's Cipher but also adds the functionality
 * of a 3 digit key that the user chooses
 * 
 * Disclaimer: I probably changed more code than what was expected or wanted
 *             I basically redesigned a decent majority of the program so that it would make more sense to me
 *             My approach is pretty naive but the program works perfectly
 *             I also could not find a partner for this. I knocked this program out within the first few days of it being available
 *             but I procrastinated finding a partner. I attempted emailing the people who sent mass messages about partners,
 *             however, I never received a response.
 *             I understand if you have to dock me points for slacking on finding a partner but I ask that you be leniant
 * 
 * @author Jesse Dahl
 */

import java.util.Arrays;
import java.util.Scanner;

/** Class for doing encryption and decryption using Caeser Cipher */
public class CaesarCipher {

    //Initialization
    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];

    //Constructor
    /**
     * Constructor that initializes the encryption and decryption arrays
     * Uses unicode values to add and subtract chars with ints
     * Ex) 'A' == 65 in unicode
     * THIS CONSTRUCTOR IS ONLY USED TO CONSTRUCT AN ARRAY, 'A-Z' IN MY FINAL PROGRAM
     * MY FINAL PROGRAM DOES NOT IMPLEMENT THE ROTATION ALGORITHM THAT IS CODED BELOW
     */
    public CaesarCipher(int rotation) {
        //For-loop that goes through all 26 available locations in each array and populates them
        for(int k=0; k<encoder.length; k++) {
          //Populates each index of encoder array with an encoded letter
          //Ex) For index 0 and rotation of 3, ('A'==65+(k+rotation)%26) == 68 which translates to the char 'D'
          encoder[k] = (char)('A' + (k + rotation)%26);
          //Populates each index of decoder array with a decoded letter
          decoder[k] = (char)('A' + (k - rotation + 26)%26);
        }
    }

    /**
     * @return String representing encrypted message
     */
    public String encrypt(String message, int[] newKey) {
      char[] msg = message.toCharArray(); //Converts the 'message' string to a sequence of characters
      int i = 0;
      for(int k=0; k<msg.length; k++) {
        if(Character.isUpperCase(msg[k])) { //Checks to see if a char in 'msg' is uppercase
          msg[k] += newKey[i]; //Adds each index of 'msg' to the respective index of 'newKey'
          if(msg[k] > 'Z') {   //If the unicode value of the index at 'msg' is greater than the unicode value of 'Z':
            msg[k] -= 26;      //Subtract 26 from the unicode value and set it equal to the index
          }
        }
        if(Character.isLowerCase(msg[k])) { //Checks to see if a char in 'msg' is lowercase
          msg[k] += newKey[i]; 
          if(msg[k] > 'z') {
            msg[k] -= 26;
          }
        }
        /*
         * This is pretty naive approach
         * If statement just makes sure that we stay within bounds of the user's 3-digit key
         * Once the code reaches the last value of the key, go back to the first value of the key
         */
        if(i<2){
          i++;
        } else {
          i=0;
        }
      }
      return(new String(msg));
    }

    /**
     * @return decrypted message given encrypted secret
     */
    public String decrypt(String secret, int[] newKey) {
      char[] msg = secret.toCharArray();
      int i = 0;
      /*
       *This whole thing basically does the opposite of the 'encrypt' method to get the decryption
       */
      for(int k=0; k<msg.length; k++) {
        if(Character.isUpperCase(msg[k])) {
          msg[k] -= newKey[i];
          if(msg[k] < 'A') {
            msg[k] += 26;
          }
        }
        if(Character.isLowerCase(msg[k])) {
          msg[k] -= newKey[i];
          if(msg[k] < 'a') {
            msg[k] += 26;
          }
        }
        if(i<2){
          i++;
        } else {
          i=0;
        }
      }
      return(new String(msg));
    }
}