import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> daysOfWeek = new ArrayList<String>();
        ArrayList<Double> dailyTemperatures = new ArrayList<Double>();
        Double averageWeeklyTemperature = 0.0;
        String input; // for the input
        int inputNum; // the result of the search for the input string in daysOfWeek

        //add the days of the week to the ArrayList
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // add the daily temperatures
        dailyTemperatures.add(44.0);
        dailyTemperatures.add(49.0);
        dailyTemperatures.add(50.0);
        dailyTemperatures.add(50.5);
        dailyTemperatures.add(49.0);
        dailyTemperatures.add(51.0);
        dailyTemperatures.add(40.5);

        // find the average temperature for the week
        for (int i = 0; i < 7; i++){
            averageWeeklyTemperature += dailyTemperatures.get(i);
        } // end for loop
        averageWeeklyTemperature /= 7;

        System.out.println("What day do you want to view the temperature for?");
        System.out.println("Enter ‘week’ to view all the daily temperatures and the weekly average.");
        System.out.print("Day: ");
        input = scan.next();

        if (daysOfWeek.contains(input)){
            // check to see if the input is a day of the week
            // if it is, print the temperature of that day
            inputNum = daysOfWeek.indexOf(input);
            System.out.println(daysOfWeek.get(inputNum) + ": " + dailyTemperatures.get(inputNum));
        } else {
            if (Objects.equals(input, "week")){
                // if the input it the word 'week', print the temperatures of each day of the week
                // and the weekly average
                for (int i = 0; i < 7; i++){
                    System.out.println(daysOfWeek.get(i) + ": " + dailyTemperatures.get(i));
                } // end for loop
                System.out.println("Weekly Average: " + averageWeeklyTemperature);
            } else {
                // if the input is not a day of the week, or the word 'week', print "Invalid input"
                System.out.println("Invalid input");
            } // end if statement if input is not a day of the week
        } // end if statement for input
    } // end Main function
} // end Main class