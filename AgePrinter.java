import java.util.Scanner;

public class AgePrinter {
    public static void main (String[] args) {
        int avgLifespan = 70;
        int userAge;

        System.out.print("Enter your age: ");
        Scanner scnr = new Scanner(System.in);
        userAge = scnr.nextInt();
        System.out.println(userAge + " is a great age.");
        System.out.println("Average lifespan is " + avgLifespan);
    }
}