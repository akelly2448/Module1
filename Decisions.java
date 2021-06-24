import java.util.Locale;
import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {
        int mph = 67;
        int speedLimit = 55;

        if (mph > speedLimit + 5) {
            System.out.println("hmmmmm....");
            System.out.println("You get a ticket!");

            int veryFast = speedLimit + 15;
            if (mph > veryFast) {
                System.out.println("You get a big ticket!");
            }
        }

        int num = 17;
        if(num % 2 ==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        //the switch statement
        int place = 2;
        String ribbonColor;

        switch (place){
            case 1:
                ribbonColor = "blue";
                System.out.println("first place!");
                break;
            case 2:
                ribbonColor = "red";
                System.out.println("second place!");
                break;
            case 3:
                ribbonColor = "white";
                System.out.println("third place!");
                break;
            default:
                ribbonColor = "unknown";
        }
        System.out.println(ribbonColor);

        Scanner console = new Scanner(System.in);
        System.out.print("Enter your patron level: ");
        String patronLevel = console.nextLine().trim().toLowerCase();

        System.out.printf("Patron perks for %s support:%n", patronLevel);
        switch (patronLevel){
            case "platinum":
                System.out.println("- one-on-one video chat.");
            case "gold":
                System.out.println("- signed ticket stub.");
            case "silver":
                System.out.println("- impersonal photo.");
            case "bronze":
                System.out.println("- my best wishes");
        }

    }
}
