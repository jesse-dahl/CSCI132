/**
 * The Stack class represents a first-in-first-out (FIFO) stack of objects. 
 * This is for our 132 class to learn about Stacks. 
 * It is similar to (but different from) java.util.Stack
 *
 * @param <E>
 */

public interface Stack<E> {

  /**
	 * @return number of elements in the stack
	 */
  int size();

  /**
	 * @return true if empty, else false
	 */
  boolean isEmpty();

  /**
   * Adds an element to the beginning of the Stack
   * @param e
   */
  void push(E e);

  /**
   * @return the top element of the Stack without removing it
   */
  E top();

  /**
   * @return and remove the top element of the Stack
   */
  E pop();
}