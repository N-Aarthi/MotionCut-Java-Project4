package game;

import java.util.Scanner;

public class HighSchoolOfTheDead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Welcome to High School of the Dead!");
        System.out.println("A virus outbreak has turned your schoolmates into flesh-eating zombies.");
        System.out.println("You are trapped in a classroom with your friend. Your goal is to find a way out of the school.\n");

        while (gameRunning) {
            System.out.println("Choose your character:");
            System.out.println("1. Steve");
            System.out.println("2. Dustin");
            System.out.print("Enter your choice (1 or 2): ");
            String characterChoice = scanner.nextLine();

            Character character;
            if (characterChoice.equals("1")) {
                character = new Character("Steve");
            } else if (characterChoice.equals("2")) {
                character = new Character("Dustin");
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                continue;
            }

            GameState gameState = new GameState(character);
            gameState.playGame(scanner);

            System.out.println("\nDo you want to play again? (yes or no): ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                gameRunning = false;
                System.out.println("Thank you for playing!");
            }
        }

        
    }
}

