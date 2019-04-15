import java.util.Scanner;

public class DoggoDemo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Doggos name:");
        String dogName = reader.nextLine();

        System.out.println(dogName + "'s age (in human years):");
        //while loop repeats until next item is an integer
        while(!reader.hasNextInt()){
            reader.next(); // Read and discard non-int inputs
            System.out.println("That is an invalid input. Try again: "); // Re-prompt
        }
        // At this point, the user has entered an int input
        int dogAge = reader.nextInt(); //Gets dog's age
        
        System.out.println(dogName + "'s weight (in pounds): ");

        //while loop repeats until the user enters either an int or double
        while(!reader.hasNextDouble()) {
            reader.next();
            System.out.println("That is an invalid input. Try again: ");
        }
        //at this point, the user has entered either an int or double
        double dogWeight = reader.nextDouble(); //Gets dog's weight

        // New object, dog, of the Doggo class
        Doggo dog = new Doggo(dogName, dogAge, dogWeight);
        dog.printDoggoInfo();

        System.out.println("\nHappy Birthday, " + dog.getName());
        dog.setAge();
        System.out.println("Updated age is " + dog.getAge());

        reader.close();
    }
}