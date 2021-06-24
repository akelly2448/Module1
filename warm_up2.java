import java.util.Scanner;
import java.util.Random;

public class warm_up2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        //boolean isValidInput;
        //do {

        //}while (isValidInput == false)

        //user input
        //System.out.println("Which joke would you like to hear? [1,2,3]");
        //int answer = Integer.parseInt(console.nextLine());

        //random joke 1,2, or 3
        int upperBound = 4;
        int answer = rand.nextInt(upperBound);



        if (answer == 1) {
            System.out.println("Knock Knock.");
            String response = console.nextLine();
            System.out.println("Annie");
            String response2 = console.nextLine();
            System.out.println("Annie thing you can do, I can do better!");
        }else if (answer == 2) {
            System.out.println("Knock Knock.");
            String response3 = console.nextLine();
            System.out.println("A leaf");
            String response4 = console.nextLine();
            System.out.println("A leaf you alone if you leaf me alone!");
        }else if (answer == 3) {
            System.out.println("Knock Knock.");
            String response5 = console.nextLine();
            System.out.println("Candice");
            String response6 = console.nextLine();
            System.out.println("Candice joke get any worse?");
        }else{
            System.out.println("Not a valid input! Don't you wanna hear a joke?");
        }


    }
}
