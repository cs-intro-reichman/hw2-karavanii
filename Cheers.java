//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
       String word = args[0];
       String Anletters = "AEFHILMNORSX";
       int repeat = Integer.parseInt(args[1]);
       word = word.toUpperCase();
       int lettercount = 0;
       while (lettercount < word.length()) {
        if (Anletters.indexOf(word.charAt(lettercount)) != -1) {
                System.out.println("Give me an " + word.charAt(lettercount) + ": " + word.charAt(lettercount) +"!" );
       }else{
                System.out.println("Give me a " + word.charAt(lettercount) + ": " + word.charAt(lettercount) +"!" );
       }
       lettercount ++;
       }
       System.out.println("What does that spell?");
       while (repeat > 0) {
        System.out.println(word + "!!!");
        repeat = repeat - 1;
       }
       
        
        }
}
