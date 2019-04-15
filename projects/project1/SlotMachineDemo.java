/**
 * A demo program that takes a user's input to represent a bet and uses the SlotMachine class to determine if they win or lose money
 * A for-loop then runs through the program a million times to see what the final balacnce would be
 * 
 * @author Jesse Dahl
 * 
 */


import java.util.Scanner;

public class SlotMachineDemo {

    public static void main(String[] args) {

        //Initialization
        Scanner reader = new Scanner(System.in);
        SlotMachine DragonsOfThunder = new SlotMachine(100); //Creates new SlotMachine object
        boolean quit = false;

        DragonsOfThunder.showDialogue();

        //While-loop that loops through taking the user's input and playing the slot machine until the user enters "-1"
        while(!quit) {
            System.out.println("Bet Amount: ");
            int bet = reader.nextInt();
            if(bet==-1) {
                DragonsOfThunder.quitSlots();
                quit = true;
            }
            else {
                DragonsOfThunder.playGame(bet);
                DragonsOfThunder.showResults();
            }
        }
        
        //For-loop that plays the game a million times
        for(int k=0; k<1000000; k++) {
            DragonsOfThunder.playGame(1);
        }
        System.out.println("After 1,000,000 more games: ");
        DragonsOfThunder.showResults();
    }
}