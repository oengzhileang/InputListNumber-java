import java.util.Scanner;

public class InputListNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int[] numbers = new int[100];
        int i = 0;
        while (true) {
            System.out.print("Input number : ");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            numbers[i] = number;
            i++;
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();

        System.out.println("Entered numbers:");
        System.out.print("[ ");
        for (int j = 0; j < i; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println("]");
    }
}
