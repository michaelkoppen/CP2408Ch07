/**
 * Created by jc428209 on 11/09/17.
 */
import java.util.Scanner;
public class ValidatePassword {
    public static void main(String[] args) {
        int x;
        int numUpperCase = 0;
        int numLowerCase = 0;
        int numDigit = 0;
        Boolean passwordInvalid = true;
        Scanner input = new Scanner(System.in);
        while(passwordInvalid) {
            System.out.print("Enter password:");
            String password = input.nextLine();
            for(x = 0; x < password.length(); x++) {
                if (Character.isUpperCase(password.charAt(x))) {
                    numUpperCase++;
                }
                if (Character.isLowerCase(password.charAt(x))) {
                    numLowerCase++;
                }
                if (Character.isDigit(password.charAt(x))) {
                    numDigit++;
                }
            }
            if (numUpperCase >= 2 && numLowerCase >=2 && numDigit >= 2) {
                System.out.println("Pasword is valid!");
                passwordInvalid = false;
            }
            else {
                System.out.println("Password is invalid, please re-enter");
            }
        }

}}
