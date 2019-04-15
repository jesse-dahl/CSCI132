/**
 * Driver class that creates an instance of the CaesarCipher class and accesses the methods of that class
 * to print information off to the user
 * 
 * @author Jesse Dahl
 */

import java.util.Scanner;
import java.util.Arrays;

/** Driver class for the CaesarCipher class*/
public class CipherDriver {

    //Initialization
    protected int[] key = new int[3];

    //Constructor
    public CipherDriver() {}

    /**
     * Method that reads the 3-digit key from the user and
     *  prints the 3-digit for the user to see
     * 
     * @return array with the three digits
     */
    public int[] key() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter three digit key: ");
        String numbers = reader.nextLine();

        //For loop that populates 'key' array with the user's inputs
        for(int i=0; i<key.length; i++) {
            key[i] = Character.digit(numbers.charAt(i), 10); //populates 'key' array with each digit in the 'numbers' string
        }
        
        //Prints the user's key, seperated by hyphens
        if(key.length>=1) {
          System.out.print("key is " + key[0]);
          for(int i=1; i<key.length; i++) {
            System.out.print("-" + key[i]);
          }
          System.out.println();
        }

        return(key);
    }

    /** Main method */
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      //New CipherDriver instance
      CipherDriver lol = new CipherDriver();
      //stores the user's 3-digit key to another array
      int[] newKey = lol.key();

      //New CaesarCipher instance
      //Parameter is 0 because I don't want the encoder array to be 'rotated'
      CaesarCipher newCipher = new CaesarCipher(0);

      System.out.print("E for encrypt, D for decrypt: "); //Asks user if they want to encrypt or decrypt a message
      String choice = reader.nextLine();

      //If the user enters 'E', encrypt their message and print the encrypted message to them
      if(choice.equals("E")) {
        System.out.println("Enter the message to encrypt: ");
        String message = reader.nextLine();
        System.out.println("Encrypted message: " + newCipher.encrypt(message, newKey)); //Calls the 'encrypt' method from CaesarCipher class
      }
      //If the user enters 'D', decrypt their message and print the original message to them
      else if(choice.equals("D")) {
        System.out.println("Enter message to decrypt: ");
        String encryptedMessage = reader.nextLine();
        System.out.println("Decrypted message: " + newCipher.decrypt(encryptedMessage, newKey)); //Calls the 'decrypt' method from CaesarCipher class
      }

      reader.close();
    }
}