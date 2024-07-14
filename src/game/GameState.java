package game;

import java.util.Scanner;

public class GameState {
    private Character character;

    public GameState(Character character) {
        this.character = character;
    }

    public void playGame(Scanner scanner) {
        System.out.println("\nYou and your friend are trapped in a classroom.");
        System.out.println("1. Try to barricade the door.");
        System.out.println("2. Search the room for weapons.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                barricadeDoor(scanner);
                break;
            case "2":
                searchForWeapons(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void barricadeDoor(Scanner scanner) {
        System.out.println("\nYou try to barricade the door, but the zombies break through.");
        System.out.println("1. Fight the zombies.");
        System.out.println("2. Run to the hallway.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\nYou fight bravely, but there are too many zombies. You get overpowered.");
                System.out.println("Game Over.");
                break;
            case "2":
                runToHallway(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void searchForWeapons(Scanner scanner) {
        System.out.println("\nYou search the room and find a baseball bat.");
        System.out.println("1. Use the bat to fight the zombies.");
        System.out.println("2. Try to escape through the window.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\nYou fight off the zombies with the bat and manage to escape the classroom.");
                escapeClassroom(scanner);
                break;
            case "2":
                System.out.println("\nYou try to escape through the window, but it's jammed. The zombies break in.");
                System.out.println("Game Over.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void runToHallway(Scanner scanner) {
        System.out.println("\nYou run into the hallway and see more zombies approaching.");
        System.out.println("1. Hide in the janitor's closet.");
        System.out.println("2. Head to the gym.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                hideInCloset(scanner);
                break;
            case "2":
                headToGym(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void escapeClassroom(Scanner scanner) {
        System.out.println("\nYou and your friend escape the classroom and head to the main hallway.");
        System.out.println("1. Try to find the exit.");
        System.out.println("2. Look for other survivors.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\nYou find the main exit but it's blocked by zombies. You get overwhelmed.");
                System.out.println("Game Over.");
                break;
            case "2":
                lookForSurvivors(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void hideInCloset(Scanner scanner) {
        System.out.println("\nYou hide in the janitor's closet and wait for the zombies to pass.");
        System.out.println("1. Sneak out and head to the roof.");
        System.out.println("2. Stay hidden until help arrives.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                headToRoof(scanner);
                break;
            case "2":
                System.out.println("\nYou stay hidden for too long and run out of supplies. The zombies find you.");
                System.out.println("Game Over.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void headToGym(Scanner scanner) {
        System.out.println("\nYou head to the gym and find a group of survivors.");
        System.out.println("1. Join the survivors and plan an escape.");
        System.out.println("2. Try to find another way out alone.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                joinSurvivors(scanner);
                break;
            case "2":
                System.out.println("\nYou try to find another way out alone but get lost and caught by zombies.");
                System.out.println("Game Over.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void lookForSurvivors(Scanner scanner) {
        System.out.println("\nYou find a group of survivors and join them.");
        System.out.println("1. Help the survivors fortify their position.");
        System.out.println("2. Lead the survivors to the roof for extraction.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                fortifyPosition(scanner);
                break;
            case "2":
                headToRoof(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void fortifyPosition(Scanner scanner) {
        System.out.println("\nYou help fortify the survivors' position, but the zombies eventually break through.");
        System.out.println("1. Fight to the end.");
        System.out.println("2. Escape to the roof.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\nYou fight bravely, but the zombies overpower you.");
                System.out.println("Game Over.");
                break;
            case "2":
                headToRoof(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void joinSurvivors(Scanner scanner) {
        System.out.println("\nYou join the survivors and plan an escape.");
        System.out.println("1. Head to the roof for military extraction.");
        System.out.println("2. Try to find a secret exit in the basement.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                headToRoof(scanner);
                break;
            case "2":
                secretExit(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void headToRoof(Scanner scanner) {
        System.out.println("\nYou and the survivors make your way to the roof, hoping for a military extraction.");
        System.out.println("1. Signal the helicopter.");
        System.out.println("2. Defend the position until help arrives.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                signalHelicopter(scanner);
                break;
            case "2":
                defendPosition(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void signalHelicopter(Scanner scanner) {
        System.out.println("\nYou signal the helicopter, and it arrives just in time.");
        System.out.println("You and the survivors are rescued!");
        System.out.println("Congratulations, " + character.getName() + "! You have survived the zombie outbreak.");
    }

    private void defendPosition(Scanner scanner) {
        System.out.println("\nYou and the survivors defend your position, but the zombies are relentless.");
        System.out.println("1. Keep fighting.");
        System.out.println("2. Try to escape to the basement.");
        System.out.print("Enter your choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\nYou fight bravely, but the zombies eventually overwhelm you.");
                System.out.println("Game Over.");
                break;
            case "2":
                secretExit(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private void secretExit(Scanner scanner) {
        System.out.println("\nYou and the survivors find a hidden exit in the basement and make your way out.");
        System.out.println("You have successfully escaped the high school!");
        System.out.println("Congratulations, " + character.getName() + "! You have survived the zombie outbreak.");
    }
}
