import java.util.Scanner;

public class TipProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Obtaining values from the user
        System.out.print("Total Bill: ");
        double bill = scan.nextDouble();
        System.out.println();
        System.out.print("Tip Percentage (as a whole number): ");
        int tipPercent = scan.nextInt();
        System.out.println();
        System.out.print("Number of People: ");
        int people = scan.nextInt();
        System.out.println();

        // Math
        double tipPayed = (double) tipPercent/100 * bill; // had to cast tipPercent or 100 in order to get intended result
        double total = bill + tipPayed;
        double perPerson = total/people;
        double tipPerPerson = tipPayed / people;

        // Printed Statements informing User
        System.out.printf("Total: $" + "%.2f", + total);
        System.out.println();
        System.out.printf("Total Tip: $" + "%.2f", + tipPayed);
        System.out.println();
        System.out.printf("Total (per person): $" + "%.2f", + perPerson);
        System.out.println();
        System.out.printf("Total Tip (per person):" + "%.2f", + tipPerPerson);
    }
}
