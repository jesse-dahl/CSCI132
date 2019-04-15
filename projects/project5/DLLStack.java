/**
 * Doubly Linked List that implements a Stack
 * @author Jesse Dahl
 * 
 * @param <E>
 */

public class DLLStack<E> implements Stack<E> {
	
	private static class Node <E> {
		// Fields
		E element;
		Node<E> prev;
		Node<E> next;
		
		// Constructor
		public Node(E e, Node<E> p, Node<E> n) {
			this.element = e;
			this.prev = p;
			this.next = n;
		}
		
    // Methods
    /**
     * @return current element of the DLLStack
     */
		public E getElement() {
			return element;
    }

    /**
     * @return previous element of the DLLStack
     */
		public Node<E> getPrev() {
			return this.prev;
    }
    
    /**
     * @return next element of the DLLStack
     */
		public Node<E> getNext() {
			return this.next;
    }
    
		public void setPrev(Node<E> p) {
			this.prev = p;
    }
    
		public void setNext(Node<E> n) {
			this.next = n;
		}

	}
	
	// Fields
	private Node<E> header;
	private Node<E> trailer;
	int size;
	
	// Constructor
	public DLLStack() { 
		this.header = new Node<>(null, null, null);
		this.trailer = new Node<>(null, this.header, null);
		this.header.setNext(this.trailer);;
	}
	
  // Methods
  
  /**
   * @return size of the DLLStack
   */
	public int size() {
		return size;
  }
  
  /**
   * @return top element of the DLLStack without removing it
   */
	public E top() {
		if (isEmpty()) {
			return null;
		}
		return this.header.next.getElement();
  }
  
  
  /**
   * @return boolean representing whether the DLLStack is empty or not
   */
	public boolean isEmpty() {
		return size == 0;
  }
  
  /**
   * Pushes new element to the front of the DLLStack
   * @param e
   */
	public void push (E e) {
		addBetween(e, this.header, this.header.getNext());
  }
  

  /**
   * Adds an element to the DLLStack at a given location
   */
	public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		this.size++;
  }
  
  /**
   * @return the first element of the DLLStack and removes it
   */
	public E pop() {
		if (this.isEmpty()) {
			return null;
		}
		return this.remove(header.getNext());
  }
  
  /**
   * @return the given element of the Doubly Linked List and removes it
   * @param e
   */
	public E remove(Node<E> e) {
		e.next.setPrev(e.prev);
		e.prev.setNext(e.next);
		this.size--;
		return e.getElement();
  }
  
  /**
   * @return the DLLStack as a string
   */
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		Node<E> walk = this.header.next;
		while (walk != this.trailer) {
			sb.append(walk.element);
			if (walk.next != this.trailer)
				sb.append(", ");
			walk = walk.next;
		}
		sb.append(")");
		return sb.toString();
	}

}
