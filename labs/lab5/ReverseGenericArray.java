import java.util.Arrays;

/** 
 * @author Jesse Dahl
 * Lab 5
 * Given a method that reverses the int elements in an array, 
 * modify it so that it is generic and reverses elements of any type array.
 * When it is finished, rename it to ReverseGenericArray.java
 * 
 * Make each array contain at least 5 elements.
 * Song is a class you will write. It should contain fields for title and artist, 
 * as well as a 'toString' method to override Arrays.toString
 * 
 * Test it with Integer, String, and Song arrays.
 *
 */

public class ReverseGenericArray {
	
	public static <T> void reverse(T[] data) {
		int low = 0, high = data.length - 1;
		while (low < high) { 			// swap data[low] and data[high]
			T temp = data[low];
			data[low++] = data[high]; 	// post-increment of low
			data[high--] = temp; 		// post-decrement of high
		}
	}

	
	public static void main(String[] args) {
		
		// test with an array of strings (done)
		Integer[] myInts = new Integer[8];
		for (int i = 0; i < myInts.length; i++) {
			myInts[i] = (i + 1) * 2;
		}
		// Using the Arrays API to print the string
		System.out.println(Arrays.toString(myInts));
		
		reverse(myInts);
		System.out.println(Arrays.toString(myInts));
		
		
		String[] myStrings = {"Dahl", "Jesse", "is", "name", "my", "Hello"};
		System.out.println(Arrays.toString(myStrings));

		reverse(myStrings);
		System.out.println(Arrays.toString(myStrings));
		
		
		/**
		 *  test with an array of Songs...
		 *  You must write the Song class -- see above.
		 */
		
		Songs[] mySongs = new Songs[5];
		mySongs[0] = new Songs("Weird Fishes", "RadioHead");
		mySongs[1] = new Songs("The World's Smiling Now", "Jim James");
		mySongs[2] = new Songs("Two-Headed Boy Pt. 2", "Neutral Milk Hotel");
		mySongs[3] = new Songs("Grounded", "Pavement");
		mySongs[4] = new Songs("Godspeed", "Frank Ocean");

		System.out.println(Arrays.toString(mySongs));

		reverse(mySongs);
		System.out.println(Arrays.toString(mySongs));
	}
	
}
