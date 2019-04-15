/**
 * Class that creates an array data structure
 * and has methods to add elements to the front and back off array
 * as well as get the nth element of the array
 * 
 * @author Jesse Dahl
 */

import java.util.Arrays;

public class ArrayDS {

  // Fields
  private int[] arr = new int[0];
  private int[] tempArr;
  private int size = 0;

  // Constructor
  public ArrayDS(){}

  // Methods
  public boolean isEmpty() {
    return(this.size == 0);
  }

  /** 
   * @return the element at a certain index given by user
   */
  public int getNth(int index) {
    int current = 0;
    for(int i = 0; i < index; i++) {
      current = arr[i+1];
    }
    return(current);
  }

  /** Adds an element at the end of array */
  public void addLast(int newInt) {
    tempArr = new int[arr.length + 1];
    for(int i = 0; i < arr.length; i++) {
      tempArr[i] = arr[i];
    }
    tempArr[tempArr.length-1] = newInt;
    arr=tempArr;
    size++;
  }

  /** Adds an element at the beginning of array */
  public void addFirst(int newInt) {
    tempArr = new int[arr.length + 1];
    tempArr[0] = newInt;
    System.arraycopy(arr, 0, tempArr, 1, arr.length);
    arr=tempArr;
    size++;
  }

  /**
   * @return a string representation of the array
   * @overrides the Arrays.toString() method
   */
  public String toString() {
    return(Arrays.toString(arr));
  }


}