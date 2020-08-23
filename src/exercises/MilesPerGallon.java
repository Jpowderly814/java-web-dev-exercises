package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles driven:");
        Double miles = input.nextDouble();
        System.out.println("Please enter gallons of gas used:");
        Double gallon = input.nextDouble();

        Double milesPerGallon = miles/gallon;
        System.out.println("The miles per gallon is " + milesPerGallon);

    }
}
