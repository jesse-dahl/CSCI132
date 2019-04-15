import java.util.Scanner;

public class MarriedNameSuggestions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String personOneFirst;
		String personOneLast;
		
		
		System.out.print("Person one, first name: ");
		personOneFirst = input.nextLine();
		System.out.print("Person one,  last name: ");
		personOneLast = input.nextLine();

		System.out.print("Person two, first name: ");
		String personTwoFirst = input.nextLine();
		System.out.print("Person two, last name: ");
		String personTwoLast = input.nextLine();

		System.out.println("Below are some possible names a married couple go with...");
		
		// TODO: Print separate names unaltered by marriage (Ex: Skyler Doe and Ryley Smith)
		// Change hard coded "Ryley Smith" to user's choice for person two...
		System.out.println(personOneFirst + " " + personOneLast + " and " + personTwoFirst + " " + personTwoLast);
		
		// TODO: Print two same last name possibilities (Ex: Skyler and Ryley Doe)
		System.out.println("\n" + personOneFirst + " and " + personTwoFirst + " " + personOneLast);
		System.out.println(personOneFirst + " and " + personTwoFirst + " " + personTwoLast);
		
		// TODO: Print two hyphenated last name possibilities (Ex: Skyler and Ryley Doe-Smith)
		System.out.println("\n" + personOneFirst + " and " + personTwoFirst + " " + personOneLast + "-" + personTwoLast);
		System.out.println(personOneFirst + " and " + personTwoFirst + " " + personTwoLast + "-" + personOneLast);
		
		input.close();
	}

}
