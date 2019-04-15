/**
 * Driver class that tests all of the data structure classes created for this project
 * Data structures include: ArrayStack, DLLStack, DLLQueue
 * 
 * @author Jesse Dahl
 */

import java.util.Arrays;

public class ADTDriver {

  /**
   * Static class used to test the ArrayStack class
   * Pushes elements to the front of the ArrayStack and removes (pops) elements from the front of the DLLStack
   */
  public static void ArrayStackDriver() {
    ArrayStack<String> arrayTestStack = new ArrayStack<>();

    arrayTestStack.push("One");
    arrayTestStack.push("Two");
    arrayTestStack.push("Three");
    arrayTestStack.push("Four");
    arrayTestStack.push("Five");

    arrayTestStack.pop();
    arrayTestStack.pop();
  }

  /**
   * Static class used to test the DLLStack class
   * Pushes elements to the front of the DLLStack and removes (pops) elements from the front of the DLLStack
   */
  public static void DLLStackDriver() {
    DLLStack<String> dllTestStack = new DLLStack<>();

    dllTestStack.push("One");
    dllTestStack.push("Two");
    dllTestStack.push("Three");
    dllTestStack.push("Four");
    dllTestStack.push("Five");
    System.out.println(dllTestStack.toString());
    dllTestStack.pop();
    dllTestStack.pop();
    System.out.println(dllTestStack.toString());
  }

  /**
   * Static class used to test the DLLQueue class
   * Adds (enqueues) elements to the end of the DLLQueue and removes (dequeues) elements from the fron of the DLLQueue
   */
  public static void DLLQueueDriver() {
    DLLQueue<Integer> dllTestQueue = new DLLQueue<>();

    dllTestQueue.enqueue(1);
    dllTestQueue.enqueue(2);
    dllTestQueue.enqueue(3);
    dllTestQueue.enqueue(4);
    dllTestQueue.enqueue(5);
    System.out.println(dllTestQueue.toString());

    dllTestQueue.dequeue();
    dllTestQueue.dequeue();
    System.out.println(dllTestQueue.toString());
  }

  /**
   * Static class used to test the CallStackValidator class
   * Driver class to check the validity of a series of method calss
   */
  public static void CallStackDriver() {
    CallStackValidator tester = new CallStackValidator();

    // Should work
    String callStack = "A calls B B calls C C halts B halts A halts";
    System.out.println(tester.isValid(callStack));

    callStack = "A calls B B calls C C calls D D halts C calls E E halts C halts B halts A halts";
    System.out.println(tester.isValid(callStack));

    callStack = "A calls A A halts A halts";
    System.out.println(tester.isValid(callStack));

    callStack = "main calls functionA functionA calls testMe testMe halts functionA calls runRun runRun halts functionA halts main halts";
    System.out.println(tester.isValid(callStack));

    // Should fail
    callStack = "main calls A A calls B A calls C B halts C halts A halts main halts";
    System.out.println(tester.isValid(callStack));

    callStack = "A calls B B halts";
    System.out.println(tester.isValid(callStack));

  }

  /**
   * Main method that calls the other driver methods
   */
  public static void main(String[] args) {
    ArrayStackDriver();
    DLLStackDriver();
    DLLQueueDriver();
    CallStackDriver();
  }
}