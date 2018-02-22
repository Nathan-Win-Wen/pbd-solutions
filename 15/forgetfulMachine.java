
import java.util.Scanner;

public class forgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give me a word! ");
        input.next();
        
        System.out.println("Give me a second word! ");
        input.next();
        
        System.out.println("Great, now your favorite number? ");
       input.nextInt();
        
        System.out.println("And your second-favorite number... ");
       input.nextInt();
        
        System.out.println("Whew! Wasn't that fun? ");
                
    }
}
