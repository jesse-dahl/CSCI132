import java.lang.Math;

public class SimpleCalculator {
	
	// Fields
	
	public double num;
	
	// Constructor (default is the empty constructor, which works here)
	public SimpleCalculator() {

	}
	
	// Methods
	public boolean checkUserOp(String op) {
		switch(op) {
			case "+":
				return(true);
			case "-":
				return(true);
			case "*":
				return(true);
			case "/":
				return(true);
			case "^":
				return(true);
			case "=":
				return(true);
			default:
				System.out.println("That is an invalid input. Try again");
				return(false);
		}
	}

	public void calculateAnswer(String op, double nextVal) {
		switch(op) {
			case "+":
				num += nextVal;
				break;
			case "-":
				num -= nextVal;
				break;
			case "*":
				num *= nextVal;
				break;
			case "/":
				num /= nextVal;
				break;
			case "^":
				num = Math.pow(num, nextVal);
				break;
		}
	}

	public void printAnswer() {
		// TODO: print the answer for the user to see
		System.out.println(num);
	}
	
}
