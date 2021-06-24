import java.util.Scanner;

public class warm_up3 {
    public static void main(String[] args) {
        //my program
        Scanner console = new Scanner(System.in);
        /*
        System.out.print("What is your name?: ");
        String name = console.next();

        System.out.print("What year were you born?: ");
        int year = Integer.parseInt(console.next());

        int age = 2021 - year;

        if (age > 100){
            System.out.println("Wow "+name+"! you've lived a lot of life if you're "+age+" years old!\nI bet you have a ton of stories to tell!");
        }else if (age > 35){
            System.out.println("Hey "+name+"! You're over 35. Have you ever considered running for President?");
        }else if (age > 21){
            System.out.println(name+", you are over the legal drinking age! Next round's on me!");
        }else{
            System.out.println("Enjoy your youth "+name+"! Life moves faster than you think!");
        }

         */


        //Yer's program
        int dashedLine = 70;

        System.out.println("Welcome to the Movie Theater! Here are your options: ");
        System.out.println("Choose your movie adventure.");

        String rowFormat = "| %-10s | %-20s | %13s | %13s |%n";

        System.out.println("-".repeat(dashedLine));
        System.out.printf(rowFormat, "Number", "Movie", "Showing Time", "Price");
        System.out.println("-".repeat(dashedLine));

        System.out.printf(rowFormat, "1", "Deadpool", "7pm", "13.5");
        System.out.printf(rowFormat, "2", "Deadpool", "12am", "20.0");
        System.out.printf(rowFormat, "3", "The Lion King", "10am", "10.0");
        System.out.printf(rowFormat, "4", "The Shining", "7pm", "13.5");
        System.out.printf(rowFormat, "5", "The Revenant", "5pm", "13.5");

        System.out.println("-".repeat(dashedLine));

        System.out.println("Which movie would you like to see?");
        System.out.print("Enter the movie number to choose your movie:");
        int movie = Integer.parseInt(console.next());


        if (movie == 1 || movie == 4 || movie == 5){
            System.out.println("The cost is $13.50");
        }else if (movie == 2){
            System.out.println("The cost is $20.00");
        }else if (movie == 3){
            System.out.println("The cost is $10.00");
        }else{
            System.out.println("Not a movie number! Go away!");
        }
    }
}
