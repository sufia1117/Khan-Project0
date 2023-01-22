import java.util.Scanner; // Import Scanner class
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input1 = new Scanner(System.in);

        // Prompt user to enter driving distance
        System.out.print("Enter the driving distance: ");
        double distance = input1.nextDouble();

        // Create a new Scanner object
        Scanner input2 = new Scanner(System.in);

        // Prompt user to enter miles per gallon
        System.out.print("Enter the miles per gallon: ");
        double mpg = input2.nextDouble();

        // Create a new Scanner object
        Scanner input3 = new Scanner(System.in);

        // Prompt user to enter price per gallon
        System.out.print("Enter the price per gallon: ");
        double ppg = input3.nextDouble();

    }
}