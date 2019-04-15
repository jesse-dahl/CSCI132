/**
 * Class that creates a Linked List data structure
 * that adds elements to the front and back of the list
 * also gets the nth element of a given node
 * 
 * @author Jesse Dahl
 */

public class LinkedListDS<E> {

  // -----Node class
  private static class Node<E> {

    //fields
    private E element;
    private Node<E> next;

    //constructor
    public Node(E e, Node<E> n) {
      this.element = e;
      this.next = n;
    }

    //methods
    public E getElement() {
      return(this.element);
    }

    public Node<E> getNext() {
      return(this.next);
    }

    public void setNext(Node<E> n) {
      this.next = n;
    }
  } // -----End of node class

  // Fields
  private Node<E> head = null; // head node for the list
  private Node<E> tail = null; // tail (last) node for the list
  private int size = 0;        // number of nodes in list

  // Constructor
  public LinkedListDS(){}

  // Methods
  /**
   * @return boolean depending on whether a linked list has nodes or not
   */
  public boolean isEmpty() {
		return this.size == 0;
  }
  
  /**
   * @return the element at a certain index
   */
  public E getNth(int index) {
    Node<E> current = this.head;

    for(int i=0; i<index; i++) {
      current = current.getNext();
    }
    return(current.getElement());
  }

  /** Method that adds a node to the beginning of the linekd list */
  public void addFirst(E e) {
    this.head = new Node<>(e, head);
    if(this.size == 0) {
      this.tail = this.head;
    }
    this.size++;
  }

  /** Method that adds a node to the end of a linked list */
  public void addLast(E e) {
    Node<E> newest = new Node<>(e, null);
    if(this.isEmpty()) {
      this.head = newest;
    }
    else {
      this.tail.setNext(newest);
    }
    this.tail = newest;
    this.size++;
  }

  /**
   * @return the string representation of linked list
   */
  public String toString() {
		StringBuilder sb = new StringBuilder("(");
		Node<E> walk = this.head;
		while (walk != null) {
			sb.append(walk.getElement());
			if (walk != this.tail)
				sb.append(", ");
			walk = walk.getNext();
		}
		sb.append(")");
		return sb.toString();
  }
  
}