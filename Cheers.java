//feedback
/*
Great work boaz!
*/
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String name = args[0];
        String an_letter = "{'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'}";
        int times = Integer.parseInt(args[1]); 
        for(int i = 0; i < name.length(); i++) {
                char letter = name.charAt(i);
                if (an_letter.indexOf(letter)!= -1){
                        System.out.println("Give me an " + letter + ": "+ letter + "!");
                }
                else{
                  System.out.println("Give me a " + letter + ": "+ letter + "!");
                }
        }
        
        for(int i = 0; i < times; i++) {
                        System.out.println(name+ "!!!");
        }
        }

}
