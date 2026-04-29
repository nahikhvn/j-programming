import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second; // whole line is a statement, but the side with the operation is expression
        System.out.println("The sum of the numbers is: " + sum);


    }

}