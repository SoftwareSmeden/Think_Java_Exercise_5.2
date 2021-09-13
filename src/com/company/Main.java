package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 5.2.

        // Imports
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
                System.out.println("- I'm thinking of a number between 1-10. \n- Can you guess what it is? \n- Type a number: ");

        // In case the user doesn't type a number.
                if (!userInput.hasNextDouble()) {
                    String word = userInput.next();
                    System.err.println(word + " is not a number.");
        }

        // Random number generator.
            int randomNumberGenerator = random.nextInt(10) + 1;


        // Letting user guess three times before the program terminates. If guessed then the program terminates.
            for (int i = 0; i < 3; i++) {

        // Program waiting for user input.
            int pickANumber = userInput.nextInt();

                if (pickANumber < randomNumberGenerator) {
                    System.out.println("- Your guess was too low. ");
                    System.out.println("- Guess again. ");

                } else if (pickANumber > randomNumberGenerator) {
                    System.out.println("- Your guess was too high. ");
                    System.out.println("- Guess again. ");

                } else if (pickANumber == randomNumberGenerator) {
                    System.out.println("- You guessed it, congrats! :-) ");
                    return;
                }
        }
        // Message given when all guesses are used.
                System.out.println("\n" + "You guessed wrong three times in a row, restart and try again.");

    }
}





