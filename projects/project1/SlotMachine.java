/**
 * A program that works as a simple slot machine
 * This program gives the user $100 to play a slot machine dmeo where they enter a number that represents an amount of digital dollars
 * in which a method prints a reel of random numbers. Determinng on the pattern of numbers that the reel displays, the program uses
 * a simple math algorithm that determines whether the user is awarded money or loses money
 * 
 * @author Jesse Dahl
 * 
 */

import java.util.Random;

public class SlotMachine {

    //Instance variables
    private int[] reels = new int[3]; //An array that holds 3 integers
    public int balance; //The balance that the user has throughout the game
    private int bet; //Number that tbe user bets
    private int win; //Number of dollars that the user wins in a single roll
    Random rand = new Random();

    //Constructors
    /**
     * 
     * @param cash Starting money that the user is alloted
     */
    public SlotMachine(int cash) {
        balance = cash;
    }

    //Accessor Methods
    /** Prints the dialogue at the beginning of each game */
    public void showDialogue() {
        System.out.println("Welcome to Dragons of Thunder Slots\nYou have $100 to start\nEnter -1 to cash out\n");
    }

    /** Method that initializes the bet variable and calls the spinReels method */
    /**
     * @param userBet the amount the user bets
     */
    public void playGame(int userBet) {
        bet = userBet;
        spinReels();
    }

    /** Populates reels array with three random integers */
    public void spinReels() {
        for(int i=0; i<reels.length; i++) {
            reels[i] = (int)(Math.random()*7 + 1);
        }
        calcResults();
    }

    /**
     * Algorithm that determines if a player wins or loses money
     */
    public void calcResults() {

        if(reels[0] == reels[1] && reels[1] == reels[2]){
            balance += ((bet*reels[0])*5);
            win += ((bet*reels[0])*5);
        } else if(reels[0] == reels[1]) {
            balance += (bet*reels[0]);
            win += (bet*reels[0]);
        } else {
            balance -= bet;
        }
    }

    /** 
     * Prints the random numbers, the amount of money won (if applicable), and thr current balance
     */
    public void showResults() {
        System.out.println("+---+---+---+\n"+"| " + reels[0] + " | " + reels[1] + " | " + reels[2] + " |\n" + "+---+---+---+");
        System.out.println("Win: $" + win);
        System.out.println("Balance: $" + balance);
        win = 0;
    }

    /** method that prints the final message to the user, containning rheir final balance */
    public void quitSlots() {
        System.out.println("Thanks for playing. Ending balance: $" + balance);
    }

}