import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        double income = 0;
        double taxWithholding;
        Boolean invalidNumber = true;

        while (invalidNumber) {
            System.out.print("Enter the weekly pay: ");
            input = scan.nextLine(); // store the user input as a string
            try {
                income = Double.parseDouble(input); // try to convert the input to a double
                invalidNumber = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input."); // if invalid,
            } // end catch
        } // end while loop for input validation

        // calculate the tax withholding
        if (income <= 0)
            taxWithholding = 0;
        else if (income < 500)
            taxWithholding = income * 0.1;
        else if (income < 1500)
            taxWithholding = income * 0.15;
        else if (income < 2500)
            taxWithholding = income * 0.2;
        else
            taxWithholding = income * 0.3;

        // print out the income and tax
        System.out.println("For an income of " + income + ", the tax withholding should be " + taxWithholding);
    }
}
