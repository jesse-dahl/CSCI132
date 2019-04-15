import java.util.Arrays;
/**
 * Lab 7 that performs experimental analysis of the algorithms prefixAlgorithm1 and prefixAlgorithm2
 * There could be a better way to go about this than going through 10 different for-loops to initialize arrays and doing all the naive stuff I did
 *  however, I forgot all about this assignment until I just received a zero for it lol, so I knocked it out this way
 * @author Jesse Dahl
 */

import java.util.Random;

public class PrefixAverages {

  private static long startTime;
  private static long stopTime;
  private static long elapsedTime;
  private static double[] data = new double[10];
  private static double[] data2 = new double[100];
  private static double[] data3 = new double[1000];
  private static double[] data4 = new double[10000];
  private static double[] data5 = new double[100000];

	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage1 (double[] x) {
		int n = x.length;
		double[] a = new double[n];
		for (int j = 0; j < n; j++) {
			double total = 0;
			for (int i = 0; i <= j; i++)
				total += x[i];
			a[j] = total / (j + 1);

		}
		return a;
	}
	
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage2(double[] x) {
		int n = x.length;
		double[] a = new double[n];
		double total = 0;
		for (int j = 0; j < n; j++) {
			total += x[j];
			a[j] = total / (j + 1);
		}
		return a;
  }
  
  /** Prints the five tests for the first algorithm */
  public static void firstTest() {
    Random randm = new Random();
    
    for(int i=0; i<data.length; i++) {
      data[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage1(data);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 10 alg 1 time: %d ns \n", elapsedTime);


    for(int i=0; i<data2.length; i++) {
      data2[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage1(data2);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 100 alg 1 time: %d ns \n", elapsedTime);

    for(int i=0; i<data3.length; i++) {
      data3[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage1(data3);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 1000 alg 1 time: %d ns \n", elapsedTime);

    for(int i=0; i<data4.length; i++) {
      data4[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage1(data4);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 10000 alg 1 time: %d ns \n", elapsedTime);

    for(int i=0; i<data5.length; i++) {
      data5[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage1(data5);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 100000 alg 1 time: %d ns \n", elapsedTime);
  }

   /** Prints the five tests for the second algorithm */
   public static void secondTest() {
    Random randm = new Random();
    
    
    for(int i=0; i<data.length; i++) {
      data[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage2(data);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 10 alg 2 time: %d ns \n", elapsedTime);


    for(int i=0; i<data2.length; i++) {
      data2[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage2(data2);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 100 alg 2 time: %d ns \n", elapsedTime);

    for(int i=0; i<data3.length; i++) {
      data3[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage2(data3);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 1000 alg 2 time: %d ns \n", elapsedTime);

    for(int i=0; i<data4.length; i++) {
      data4[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage2(data4);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 10000 alg 2 time: %d ns \n", elapsedTime);

    for(int i=0; i<data5.length; i++) {
      data5[i] = randm.nextInt(99);
    }

    startTime = System.nanoTime();
    prefixAverage2(data5);
    stopTime = System.nanoTime();
    elapsedTime = stopTime - startTime;
    System.out.printf("n = 100000 alg 2 time: %d ns \n", elapsedTime);
  }

	public static void main(String[] args) {

    firstTest();
    secondTest();

    System.out.println("These results indicate the growth function of the first algorithm is quadratic time (O(n^2)), and second algorithm is linear time (O(n))");
    
	}

}
