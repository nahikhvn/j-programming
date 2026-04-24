import java.util.Scanner;

public class DifferentTypesofInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String str = scanner.nextLine();

        System.out.println("Give an integer: ");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double: ");
        double n = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean: ");
        boolean b = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + n);
        System.out.println("You gave the boolean " + b);

    }

}