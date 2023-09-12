/**
 * @author Ben Irastorza
 * @version 1.1337
 */
/*
    * Everything is done through the command line
    * This program is for universities that grade on the scale:
    A = 4.0
    B = 3.0
    C = 2.0
    D = 1.0
 */
import java.util.Scanner;
import java.util.ArrayList;

public class GPACalculator {
    /**
     * @param args main method parameter
     */
    public static void main(String[] args) {
        int totalCredHrs = 0;
        int qualPts = 0;
        double finalGPA;
        int scanCount = 0;

        String name;
        String grade;
        int credHours;
        Scanner scan = new Scanner(System.in);
        ArrayList<Class> myClass = new ArrayList<>();
        String done = "yes";

        System.out.println("_________________________");
        System.out.println("College GPA Calculator");

        while (!done.equals("no")) {
            System.out.print("\nWhat is your class name? : ");
            if (scanCount != 0) {
                scan.nextLine();
            }
            name = scan.nextLine();
            System.out.print("What is your grade in this class? A, B, C, D, or F: ");
            grade = scan.next();
            System.out.print("How many credit hours is course? (Type as an integer): ");
            credHours = scan.nextInt();

            try {
                myClass.add(new Class(name, grade, credHours));
                System.out.println("Class add successful.");
                System.out.println(myClass.get(scanCount).toString());
                scanCount++;
                System.out.print("To add another class enter \"yes\" otherwise type \"no\": ");
                done = scan.next().toLowerCase();
            } catch (IllegalArgumentException iae) {
                System.out.println("You entered an illegal grade or credit hour please try again.");
            }
        }
        System.out.println("\nCalculating...");
        for (Class aClass : myClass) {
            totalCredHrs += aClass.getCredHours();
            qualPts += (aClass.getCredHours() * aClass.getGradeNum());
        }
        finalGPA = (double) qualPts / totalCredHrs;
        System.out.printf("Your GPA is: %.2f", finalGPA);
    }
}
