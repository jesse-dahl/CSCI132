/**
 * Class that is used to create objects of each data structure class
 * and tests the time each data structure takes to add elements to the front and back of the data structure
 * and also calculates the time it takes to get the integer at a user-inputted index
 * 
 * @author Jesse Dahl
 */

import java.util.Random;
import java.util.Arrays;

public class LinkedListVsArrayDemo {

  // fields
  private static long startTime;
  private static long stopTime;
  private static long elapsedTime;
  private static ArrayDS arrayInstance = new ArrayDS();                                     // Instance of ArrayDS class
  private static LinkedListDS<Integer> linkedListInstance = new LinkedListDS<Integer>();    // Instance of LinkedListDS class
  private static int[] test = new int[10000];                                               // initializes array of 10000 elements

  /**
   * Method that tests the data structures and verifies that they work
   * In order to test the data structures, just replace the '.addFirst' calls with '.addLast' and vice versa
   * It is also recommended to change the size of the 'test' array to 10 instead of 10,000
   * You may also want to comment all of the code in the main method after the 'testDS()' method call
   */
  public static void testDS() {
    //Tests the linked list data structure
    for(int i : test) {
      linkedListInstance.addFirst(test[i]); // <-- change to .addLast or .addFirst to test the linked list methods
    }
    System.out.println(linkedListInstance);
    System.out.println(linkedListInstance.getNth(2)); // Gets the second element of linked list (uses comp sci indexing e.g. 0 relates the the first index)

    for(int i : test) {
      arrayInstance.addLast(test[i]);       // <-- change to .addFirst or .addLast to test the array methods
    }
    System.out.println(arrayInstance);
    System.out.println(arrayInstance.getNth(2));      // Gets the second element of array (also uses comp sci indexing)
  }

  public static void main(String[] args) {
    Random random = new Random();

    for(int i = 0; i < test.length; i++) {     // for-loop that populates array with random integers
      test[i] = random.nextInt(10);
    }
    //testDS(); // uncomment this method call and comment all code after this to use the 'testDS()' method above

    /** Start testing for linked list */
    startTime = System.nanoTime();           // starts timer
    for(int i : test) {                      // for-loop that adds each element of test array to the tail node of Linked List data structure
      linkedListInstance.addLast(test[i]);
    }
    stopTime = System.nanoTime();            // stops timer
    elapsedTime = stopTime - startTime;      // calculates elapsed time
    System.out.printf("addLast --LList: %d microseconds\n", elapsedTime/1000);  // prints the elapsed time / 1000 to convert nanoseconds to microseconds

    startTime = System.nanoTime();           // starts timer
    for(int i : test) {                      // for-loop that adds each element of test array to the head node of Linked List
      linkedListInstance.addFirst(test[i]);
    }
    stopTime = System.nanoTime();            // stops timer
    elapsedTime = stopTime - startTime;
    System.out.printf("addFirst --LList: %d microseconds\n", elapsedTime/1000); // prints the elapsed time

    startTime = System.nanoTime();           // starts timer
    linkedListInstance.getNth(2);            // gets the second element of linked list
    stopTime = System.nanoTime();            // stops timer
    elapsedTime = stopTime - startTime;
    System.out.printf("getNth --LList: %d microseconds\n\n", elapsedTime/1000); //prints the elapsed time
    /** End testing for linked list */

    /** Start testing for array */
    startTime = System.nanoTime();           // starts timer
    for(int i : test) {                      // for-loop that adds each element of test array to the end of arrayInstance array
      arrayInstance.addLast(test[i]);
    }
    stopTime = System.nanoTime();            // stops timer
    elapsedTime = stopTime - startTime;
    System.out.printf("addLast --Array: %d microseconds\n", elapsedTime/1000);  // prints the elapsed time

    startTime = System.nanoTime();           // starts timer
    for(int i : test) {                      // for-loop that adds each element of test array to the beginning of arrayInstance array
      arrayInstance.addFirst(test[i]);
    }
    stopTime = System.nanoTime();            // stops timer
    elapsedTime = stopTime - startTime;
    System.out.printf("addFirst --Array: %d microseconds\n", elapsedTime/1000);  // prints elapsed time

    startTime = System.nanoTime();           // starts timer
    arrayInstance.getNth(2);                 // gets second element of arrayInstance array
    stopTime = System.nanoTime();            // stops timer
    elapsedTime = stopTime - startTime;
    System.out.printf("getNth --Array: %d microseconds\n\n", elapsedTime/1000);  // prints elapsed time
    /** End testing for arrays */

    /** Time complexity results */
    System.out.println("ArrayDS.addFirst(): Quadratic Time");
    System.out.println("ArrayDS.addLast(): Linear Time");
    System.out.println("ArrayDS.getNth(): Constant Time");
    System.out.println("-----");
    System.out.println("LListDS.addFirst(): Constant Time");
    System.out.println("LListDS.addLast(): Constant Time");
    System.out.println("LListDS.getNth(): Constant Time");
    
  }
}