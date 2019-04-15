/**
 * Class that checks the validity of a given series of function calls
 * 
 * @author Jesse Dahl
 */

import java.util.Scanner;

public class CallStackValidator {

    //Constructor
    public CallStackValidator() {

    }

    /**
     * Method that validates a series of function calls
     * @param call String of function calls
     * @return boolean that represents if a series of function calls are valid or not
     */
    public boolean isValid(String call) {
        DLLStack<String> buffer = new DLLStack<>(); // Creates new stack to store method calls
        Scanner callStack = new Scanner(call);  // Allows us to traverse the string of method calls
        String next = callStack.next(); // String of temporary substrings in "call" string

        if(call == null) {  // If the string of method calls is empty, return false
            return(false);
        }
        buffer.push(next);  // pushes the first substring to the stack
        while(callStack.hasNext() || callStack != null) { // Loop until callStack is null
            if(next.equals("calls")) {  // If the current substring is "calls"
                buffer.push(callStack.next()); // push the next substring (will be a method name) to buffer
                next = callStack.next(); // Sets "next" equal to the next substring after the method name
            }

            else if(next.equals("halts") && callStack.hasNext()) { // If the current substring is "halts" and the "halts" isnt the last substring in "callStack"
                buffer.pop();  // Remove the first method call from the stack
                next = callStack.next(); // Sets "next" equal to the next substring after the method name
            }

            else if(next.equals("halts")) { // If the current substring is "halts". This statement was created to deal with the final "halts" in the original string of method calls
                buffer.pop();  // Remove the final method call from the stack
                break; // break out of the while-loop
            }

            else if(next.equals(buffer.top())) { // Checks if the current substring is equal to the top method call in the stack
                next = callStack.next(); // Continue
            }

            else { 
                return(false); // If none of the above applies, the method call sequence is not valid
            }
        }
        return(buffer.isEmpty()); // Return true if the stack is empty and false if the stack isn't empty
    }
}