import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();

        System.out.println("Введите числа (0 для завершения):");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        System.out.println("Несовпадающие числа в последовательности:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}