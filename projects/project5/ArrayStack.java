/**
 * ArrayStack that implements a Stack
 * 
 * @author Jesse Dahl
 * 
 * @param <E>
 */

public class ArrayStack<E> implements Stack<E> {

  // Fields
  public static final int CAPACITY = 1000; // Default array capacity
  private E[] data; // Generic array for storage
  private int t = -1; // Index of top element in stack
  
  // Constructor
  public ArrayStack() { // Constructs stack with default capacity
    this(CAPACITY);
  }

  /**
   * Constructor
   * @param capacity
   */
  public ArrayStack(int capacity) { // Constructs stack with given capacity
    data = (E[]) new Object[capacity]; //Safe cast; may cause compiler warning
  }

  /**
   * @return size of ArrayStack
   */
  public int size() {
    return(t+1);
  }

  /**
   * @return boolean if ArrayStack is empty or not
   */
  public boolean isEmpty() {
    return(t == -1);
  }

  /**
   * Pushes new element to the front of the ArrayStack
   * @param e
   */
  public void push(E e) throws IllegalStateException {
    if(size() == data.length) {
      throw new IllegalStateException("Stack is full");
    }
    data[++t] = e; // Increments t before storing a new item
  }

  /**
   * @return top element of the ArrayStack without removing it
   */
  public E top() {
    if(isEmpty()) {
      return(null);
    }
    return(data[t]);
  }

  /**
   * @return and remove the top element of the ArrayStack
   */
  public E pop() {
    if(isEmpty()) {
      return(null);
    }
    E answer = data[t];
    data[t] = null;
    t--;
    return(answer);
  }

}