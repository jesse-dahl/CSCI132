import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class InsertionSortDemo {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Random randm = new Random();

    System.out.println("Please enter an integer representing how many elements you would like in the array: ");

    while(!reader.hasNextInt()) {
      System.out.println("Please enter an integer: ");
      reader.next();
    }
    
    int size = reader.nextInt();
    int[] arr = new int[size];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = randm.nextInt(99);
    }

    InsertionSort sortAlg = new InsertionSort(arr);

    System.out.println("Your original array is: ");
    System.out.println(Arrays.toString(arr) + "\n");
    System.out.println("Please choose one of the sorting options below: ");

    int choice = 0;

    while(choice != 3) {
      System.out.println("1. Sort Ascending \n2. Sort Descending\n3. Quit\n");
      choice = reader.nextInt();
      switch(choice) {
        case 1:
          System.out.println("\nYour array sorted in ascending order: ");
          System.out.println(Arrays.toString(sortAlg.AscendingSort()) + "\n");
          break;
        case 2:
          System.out.println("\nYour array sorted in descending order: ");
          System.out.println(Arrays.toString(sortAlg.DescendingSort()) + "\n");
          break;
        case 3:
          System.out.println("Ay thanks for trying the program");
          break;
        default:
          System.out.println("Please enter a valid choice: ");
          break;
      }
    }
    reader.close();
  }
}