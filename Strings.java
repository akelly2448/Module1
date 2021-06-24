public class Strings {

    public static void main(String[] args) {
        System.out.println("hello strings");

        String message = "My dog has fleas.";
        System.out.println(message);

        // use \n in a string to get a new line.
        String poem = "Roses are red.\nViolets are Blue.";
        System.out.println(poem);

        // to include the backward slash as a string we escape it with \\

        //equality
        String a = "apple";
        String b = "ball";
        String c = "apple";


        System.out.println(a == b); //false
        System.out.println(a == c); //true but should be false

        System.out.println(a.equals(b)); //false
        System.out.println(a.equals(c)); //true


    }
}
