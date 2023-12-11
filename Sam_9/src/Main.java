import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 7 == 0) {
                sum += array[i];
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Сумма чисел, которые делятся на 7: " + sum);
            System.out.println("Количество чисел, которые делятся на 7: " + count);
            System.out.println("Среднее значение среди чисел, которые делятся на 7: " + average);
        } else {
            System.out.println("В массиве нет чисел, которые делятся на 7.");
        }
    }
}