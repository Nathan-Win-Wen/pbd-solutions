
import java.util.Scanner;

public class moreUserData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the following information so I can sell it for a profit");
        System.out.println("");
        
        System.out.print("First name: ");
        String firstName = input.next();
        
        System.out.print("Last name: ");
        String lastName = input.next();
        
        System.out.print("Grade (9-12): ");
        int grade = input.nextInt();
        
        System.out.print("Student ID: ");
        int id = input.nextInt();
        
        System.out.print("Login: ");
        String login = input.next();
        
        System.out.print("Average: ");
        double avg = input.nextDouble();
        
        System.out.println("");
        System.out.println("Your information: ");
        System.out.println("    Login: " + login);
        System.out.println("    ID:    " + id);
        System.out.println("    Name:  " + lastName + ", " + firstName);
        System.out.println("    Avg:   " + avg);
        System.out.println("    Grade: " + grade);
    }
}
