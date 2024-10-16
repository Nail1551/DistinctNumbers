import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        System.out.println("Введите числа (0 для завершения):");

        int num;
        while ((num = scanner.nextInt()) != 0) {
            uniqueNumbers.add(num);
        }

        System.out.println("Несовпадающие числа в последовательности:");
        uniqueNumbers.forEach(System.out::println);

        if (!uniqueNumbers.isEmpty()) {
            List<Integer> numbersList = new ArrayList<>(uniqueNumbers);
            Integer maxNumber = maxArrayList(numbersList);
            System.out.println("Максимальное число: " + maxNumber);
        } else {
            System.out.println("Список чисел пуст.");
        }

        scanner.close();
    }

    public static <E extends Comparable<E>> E maxArrayList(List<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым или null");
        }

        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}