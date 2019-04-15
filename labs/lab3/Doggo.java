import java.util.Scanner;

public class Doggo {

    // Instance variables
    private String dogName;
    private int dogAge;
    private double dogWeight;

    //Constructor
    public Doggo(String name, int age, double weight) {
        dogName = name;
        dogAge = age;
        dogWeight = weight;
    }

    // Methods
    public void setAge() {
        dogAge+=1;
    }

    public String getName() {
        return(dogName);
    }

    public int getAge() {
        return(dogAge);
    }

    public int getDogAge() {
        return(dogAge*7);
    }

    public double getWeight() {
        return(dogWeight/2.205);
    }

    public void printDoggoInfo() {
        System.out.println("--Doggo Info--");
        System.out.println("Doggo's Name: " + getName());
        System.out.println("Doggo's Age: " + getDogAge() + " dog years");
        System.out.println("Doggo's Weight: " + getWeight() + " kilos");
    }
}