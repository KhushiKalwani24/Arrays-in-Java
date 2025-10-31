import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
                       for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
                for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is positive and even.");
                } else {
                    System.out.println("The number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println("The number " + number + "is negative.");
            } else {
                System.out.println("The number " + number + " is zero.");
            }
        }
              if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and the last number are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
