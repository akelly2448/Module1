import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        //initialization variables
        Scanner console = new Scanner(System.in);
        int lives = 3;
        boolean isPlaying = true;
        boolean inBasement = true;
        boolean hasKey = false;
        boolean inHouse = true;


        System.out.println("You wake up in the basement of a haunted house(spooky) and you don't know why.");
        System.out.println("Your objective is to escape the house without losing all three of your lives to the ghosts!\n");


        while (inBasement) {

            System.out.println("What do you want to do?");
            System.out.println("1: Catch your breath");
            System.out.println("2: Go upstairs");
            System.out.println("3: Look around");
            System.out.println();
            System.out.println("type \"1\", \"2\", or, \"3\"");
            System.out.println();

            String input = console.nextLine();

            switch (input) {
                case "1":
                    //basement
                    System.out.println("You run directly into a ghost and it slaps you in the face!!");
                    System.out.println("You feel some of your life force leave your body.");
                    lives--;
                    System.out.println();
                    System.out.println("Lives Remaining: " + lives);
                    System.out.println();
                    if (lives == 0) {
                        System.out.println("YOU DIED!");
                        System.exit(0);
                    }

                    break;
                case "2":
                    //foyer
                    System.out.println("You made it upstairs.");
                    inBasement = false;
                    break;
                case "3":
                    System.out.println();
                    System.out.println("That's a wall.");
                    System.out.println("You didn't go anywhere.");
                    System.out.println();
                    break;
            }
        }

        //upstairs
        System.out.println("You see the entrance to a bedroom and you also see a storage closet in the corner.");
        System.out.println("Directly across the way, you also see what appears to be the exit to the house.");

        while (!hasKey) {
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("1: Check storage closet.");
            System.out.println("2: Check bedroom.");
            System.out.println("3: Try the door to the exit.");
            System.out.println();
            System.out.println("type \"1\", \"2\", or, \"3\"");
            System.out.println();

            String input = console.nextLine();

            switch (input) {
                case "1":
                    //basement
                    System.out.println("You find a big SHINY KEY!");
                    System.out.println("I wonder if this could be useful...");
                    hasKey = true;
                    break;
                case "2":
                    //ghost
                    System.out.println("BOO!");
                    System.out.println("A ghost scares the literal life out of you!");
                    lives--;
                    System.out.println("Lives Remaining: " + lives);
                    if (lives == 0) {
                        System.out.println("YOU DIED!");
                        System.exit(0);
                    }

                    break;
                case "3":
                    System.out.println("You try to escape out of the front door but it's locked.");
                    break;
            }
        }
        while (inHouse) {
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("1: Check storage closet.");
            System.out.println("2: Check bedroom.");
            System.out.println("3: Escape the haunted house!");
            System.out.println("type \"1\", \"2\", or, \"3\"");
            System.out.println();

            String input = console.nextLine();

            switch (input) {
                case "1":
                    System.out.println("You find a big SHINY KEY!");
                    System.out.println("I wonder if this could be useful...");
                    hasKey = true;
                    break;
                case "2":
                    //ghost
                    System.out.println("BOO!");
                    System.out.println("A ghost scares the literal life out of you!");
                    lives--;
                    System.out.println("Lives Remaining: " + lives);
                    if (lives == 0) {
                        System.out.println("YOU DIED!");
                        System.exit(0);
                    }
                    break;
                case "3":
                    System.out.println("You use the SHINY KEY to open the door to the haunted house and you escape!");
                    System.out.println("CONGRATULATIONS! You WIN the game!");
                    System.exit(0);
                    break;
            }


        }


    }
}


