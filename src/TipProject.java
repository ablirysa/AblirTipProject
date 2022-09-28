import java.util.Scanner;

public class TipProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Total Bill: ");
        double bill = scan.nextDouble();
        System.out.println();

        System.out.print("Tip Percentage (as a whole number): ");
        int tipPercent = scan.nextInt();
        System.out.println();

        System.out.print("Number of People: ");
        int people = scan.nextInt();
        System.out.println();

        double tipPayed = (double) tipPercent/100 * bill;
        double total = bill + tipPayed;
        double perPerson = total/people;
        double tipPerPerson = tipPayed / people;
        System.out.printf("In this scenario, the total would be $" + "%.2f", + total);
        System.out.printf(" and each person is going to pay $" + "%.2f", + perPerson);
        System.out.printf(" with the tip per person being $" + "%.2f", + tipPerPerson);
    }
}
