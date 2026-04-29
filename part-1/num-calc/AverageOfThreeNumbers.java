import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        double first = (double) Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        double second = (double) Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        double third = (double) Integer.valueOf(scanner.nextLine());

        double quotient = (first + second + third) / 3;
        System.out.println("The average is: " + quotient);

    }

}