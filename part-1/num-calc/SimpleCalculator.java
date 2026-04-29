import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        double first = (double) Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        double second = (double) Integer.valueOf(scanner.nextLine());

        double sum = first + second;
        double diff = first - second;
        double prod = first * second;
        double quotient = first / second;

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + diff);
        System.out.println(first + " * " + second + " = " + prod);
        System.out.println(first + " / " + second + " = " + quotient);

    }

}