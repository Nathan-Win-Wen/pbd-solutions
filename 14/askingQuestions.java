
import java.util.Scanner;

public class askingQuestions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How old are you? ");
        int age = input.nextInt();
		
		System.out.print("How many feet tall are you? ");
		int feet = input.nextInt();
		
		System.out.print("And how many inches? ");
		int inches = input.nextInt();
		
		System.out.print("How many pounds do you weigh? ");
		double weight = input.nextDouble();

		System.out.println("So you're " + age + " old, " + feet + "'" + inches + "\"" + " tall and " + weight + "lbs heavy." );

	}
}
