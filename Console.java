import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = console.nextLine();  //nextLine returns a string
        System.out.println("Your name is: "+name);

        System.out.println("Enter a grocery item: ");
        String grocery = console.nextLine();
        System.out.println("How much does it cost?: ");
        String input = console.nextLine();
        double cost = Double.parseDouble(input);             //parse input to a double
        System.out.println("How many are available?: ");
        int inventory = Integer.parseInt(console.nextLine());//parse in one line
        System.out.println("Is it taxable? [true/false]: ");
        boolean isTaxable = Boolean.parseBoolean(console.nextLine());

        //report
        System.out.println();
        System.out.println("========================");
        System.out.println(grocery +": $"+cost);
        System.out.println("Current inventory: "+inventory);
        System.out.println("Taxable: "+isTaxable);

        //note: using .print is the same as using .println but the user input is on the same line
        System.out.print("What's 2+2?: ");
        String answer = console.nextLine();

        //printf must have same number of placeholders as arguments
        System.out.printf("%s has %s %s and can jump %s inches high.", "John", 3, "cows", 40.26);

        String rowFormat = "| %-20s | %-15s | %6s |%n";
        //header
        System.out.println("Beetle Families");
        System.out.println("-".repeat(51));
        System.out.printf(rowFormat, "Common Name", "Latin Name", "Rating");
        System.out.println("-".repeat(51));

        //rows
        System.out.printf(rowFormat, "Carrion Beetles", "Silphidae", 4.8);
        System.out.printf(rowFormat, "Dark Beetles", "Shondhidae", 3.7);
        System.out.printf(rowFormat, "Fireflies", "londidae", 6.4);
        System.out.printf(rowFormat, "Fungus Weevils", "Blondidae", 2.6);
        System.out.printf(rowFormat, "Ladybugs", "Flonidae", 5.7);

        //footer
        System.out.println("-".repeat(51));

        //format strings
        String firstName = "John";
        String lastName = "Dingus";
        String fullName = String.format("%s %s", firstName,lastName);
        String title = String.format("Name: %s, Occupation: %s",fullName, "Plumber");
    }
}
