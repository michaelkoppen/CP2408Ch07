/**
 * Created by jc428209 on 11/09/17.
 */
import java.util.Scanner;
public class CountMovieSpaces2 {
    public static void main(String[] args) {
        int x;
        int numSpaces = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite movie quote:");
        String quote = input.nextLine();
        for(x = 0; x < quote.length(); x++) {
            if(quote.charAt(x) == ' ') {
                numSpaces += 1;
            }
        }
        System.out.println("Total number of spaces = " + numSpaces);
    }
}
