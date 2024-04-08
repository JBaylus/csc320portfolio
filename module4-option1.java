import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total, average, max = 0, min = 0, num, interest; // not initializing max and min resulted in compiler errors
        int count = 0;
        total = 0;
        String input;

        while (count < 5) {
            System.out.print("Enter a number: ");
            input = scan.next();
            // try to convert the user's input to a double
            // this loop will continue until 5 numbers have been entered
            try {
                num = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input.");
                continue;
            }
            // set the min and max to the first number entered
            if (count == 0) {
                min = num;
                max = num;
            } else {
                // if the new number is lower than the min or higher than the max
                // set the min or max to the new number
                if (num < min)
                    min = num;
                if (num > max)
                    max = num;
            }
            total += num;
            count++;
        }

        average = total / 5;
        interest = total * 1.2;

        System.out.println();
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Total with 20% interest = " + interest);
    }
}