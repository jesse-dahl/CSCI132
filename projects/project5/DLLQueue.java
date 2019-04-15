/**
 * Doubly Linked List implementing a Queue
 * @author Jesse Dahl
 * 
 * @param <E>
 */

public class DLLQueue<E> implements Queue<E> {
	
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
     * @return the current element of the DLLQueue
     */
		public E getElement() {
			return element;
    }
    
    /**
     * @return the previous element of the DLLQueue
     */
		public Node<E> getPrev() {
			return this.prev;
    }
    
    /**
     * @return the next element of the DLLQueue
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
	public DLLQueue() { 
		this.header = new Node<>(null, null, null);
		this.trailer = new Node<>(null, this.header, null);
		this.header.setNext(this.trailer);;
	}
	
  // Methods
  /**
   * @return size of the DLLQueue
   */
	public int size() {
		return size;
  }
  
  /**
   * @return first element of the DLLQueue
   */
	public E first() {
		if (isEmpty()) {
			return null;
		}
		return this.header.next.getElement();
  }
  
  /**
   * @return boolean representing if the DLLQueue is empty or not
   */
	public boolean isEmpty() {
		return size == 0;
  }
  
  /**
   * Adds element to the end of the DLLQueue
   * @param e
   */
	public void enqueue (E e) {
		addBetween(e, this.trailer.getPrev(), this.trailer);
  }
  
  /**
   * Adds element to a given position in the DLL/DLLQueue
   * @param e
   * @param predecessor
   * @param successor
   */
	public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		this.size++;
  }
  
  /**
   * @return and remove the first element of the DLLQueue
   */
	public E dequeue() {
		if (this.isEmpty()) {
			return null;
		}
		return this.remove(header.getNext());
  }
  
  /**
   * @return and remove the given element of DLL/DLLQueue
   * @param e
   */
	public E remove(Node<E> e) {
		e.next.setPrev(e.prev);
		e.prev.setNext(e.next);
		this.size--;
		return e.getElement();
  }
  
  /**
   * @return the DLLQueue as a string
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
