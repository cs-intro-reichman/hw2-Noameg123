//feedback
/*
Great work boaz!
*/
// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String name = args[0].toUpperCase(); // הופך את השם לאותיות גדולות
        String an_letters = "AEFHILMNORSX";  
        int times = Integer.parseInt(args[1]);

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (an_letters.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }
        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(name + "!!!");
        }
    }
}
