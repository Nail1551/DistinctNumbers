import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();

        System.out.println("Введите числа (0 для завершения):");

        int num;
        while ((num = scanner.nextInt()) != 0) {
            numbers.add(num);
        }

        System.out.println("Несовпадающие числа в последовательности:");
        numbers.forEach(System.out::println);

        scanner.close();
    }
}