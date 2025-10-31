import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
        int[] multiplicationResult = new int[4 * 10]; 
                int index = 0;
        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[index] = i * j;
                index++;
            }
        }
       index = 0;
        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + multiplicationResult[index]);
                index++;
            }
        }
        scanner.close();
    }
}