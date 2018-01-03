import java.util.Scanner;

public class Temperature Converter {
    public static void main(String[] args) {

        System.out.println("Welcome! This is a program that allows a user to convert \n" +
                "From either \"F\" if we're converting from Fahrenheit to Celsius  \n" +
                "Or \"C\" if we're converting from Celsius to Fahrenheit");

        Scanner scan = new Scanner(System.in);

        System.out.println ("Please enter \"F\" if you are converting from Fahrenheit");
        System.out.println ("Please enter \"C\" if you are converting from Celsius");

        String temp_key = scan.nextLine();

        System.out.println("Please enter a number in so we can start Converting!");

        double temp_value = scan.nextDouble();

        if (temp_value.equals("F"));


    }
}