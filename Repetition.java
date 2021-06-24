import java.util.Random;

public class Repetition {
    public static void main(String[] args) {
        int count = 10;
        System.out.println("Countdown!");

        while (count > 0){
            System.out.println(count);
            count--;
        }
        System.out.println("Blast Off!");

        Random rand = new Random();
        int a = 1;
        int b = 2;
        int c = 3;

        while (a<50 || b%2 ==0 && c%3 != 0){
            System.out.printf("%s,%s,%s%n , a, b, c");

            a = rand.nextInt();
            b = rand.nextInt();
            c = rand.nextInt();
        }
    }
}
