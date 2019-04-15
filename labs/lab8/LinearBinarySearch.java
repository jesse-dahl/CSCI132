import java.util.Arrays;
import java.util.Random;

public class LinearBinarySearch {

  public static int checks = 0;

  int linearSearch(int[] data, int target, int size) {
    if(size < 0) { // Base Case - Not Found
      return(-1);
    }
    else if(data[size] == target) {
      return(size); // Base Case - Found
    } 
    else {
      checks++;
      return(linearSearch(data, target, size - 1)); // Recursive Case
    }
  }

  int binarySearch(int[] data, int target, int low, int high) {
    Arrays.sort(data);
    if (high > low) {
      int mid = (low + (high - 1)) / 2;

      if(data[mid] == target) {
        return(mid);  // Base Case - If the target is found
      } 
      else if(target < data[mid]) {
        checks++;
        return(binarySearch(data, target, low, mid - 1));  // Recursive Case - If the target is less than the current mid-point
      } 
      else {
        checks++;
        return(binarySearch(data, target, mid + 1, high)); // Recursive Case - If the target is greater than the current mid-point
      }
    }
    return(-1);  // Base Case - If the target isn't found
  }

  public static void main(String[] args) {
    Random random = new Random();
    LinearBinarySearch ob = new LinearBinarySearch();

    int[] arr = new int[1000];
    int target = 77;
    
    for(int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(700);
    }
    
    System.out.println("\n***Linear Search***");
    int result2 = ob.linearSearch(arr, target, arr.length - 1);
    if(result2 == -1)
      System.out.println("The element is not present in the array");
    else
      System.out.printf("Element %d found at index %d \n", target, result2);
      System.out.printf("%d searches required for input size %d \n \n", checks, arr.length);

    checks = 0;
    System.out.println("***Binary Search***");
    int result = ob.binarySearch(arr, target, 0, arr.length - 1);
    if(result == -1) 
      System.out.println("The element is not present in the array");
    else
      System.out.printf("Element %d found at index %d \n", target, result);
      System.out.printf("%d searches required for input size %d \n \n", checks, arr.length);

  }
}