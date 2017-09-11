/**
 * Created by jc428209 on 11/09/17.
 */
public class CountMovieSpaces {
    public static void main(String[] args) {
        int x;
        int numSpaces = 0;
        String quote = "It's over Anakin, I have the high ground!";
        for(x = 0; x < quote.length(); x++) {
            if(quote.charAt(x) == ' ') {
                numSpaces += 1;
            }
        }
        System.out.println("Total number of spaces = " + numSpaces);
    }
}
