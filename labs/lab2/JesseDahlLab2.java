import java.util.Scanner;

public class JesseDahlLab2 {

    //Public method that determines if there are matching integers in a given array
    public static boolean matchingNumbers(int[] digArray) {
        //Initialization
        int i, j;
        boolean duplicates = false;

        //For loops that compare each element of the array to each element after it
        for(i=0; i<digArray.length; i++) {
            for(j=i+1; j<digArray.length; j++) {
                if(digArray[i]==digArray[j]) {
                    duplicates = true; //If there are matching numbers change the value of duplicates to true
                    break; //break out of loop if there are matching numbers
                }
            }
        }
        return(duplicates); //returns the boolean value of duplicates
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many digits are in the number you want to test?");
        int dig = Integer.parseInt(reader.nextLine());
        int[] digArray = new int[dig];

        System.out.println("Enter the number, each digit on a new line:");

        //For loop that populates the array with user-inputted values
        for(int i=0; i<digArray.length; i++) {
            digArray[i] = reader.nextInt();
        }

        //Method call that checks if there are matching numbers in the array
        if(matchingNumbers(digArray) == true) {
            System.out.println("Yes. That number does contain matching digits");
        } else {
            System.out.println("No. That number does not contain matching digits");
        }

        reader.close();

    }
}