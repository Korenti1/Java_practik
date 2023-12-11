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
        int evenSum = 0;
        int evenCount = 0;
        int minEvenPositiveIndex = -1;
        int maxEvenPositiveIndex = -1;
        int minEvenPositive = Integer.MAX_VALUE;
        int maxEvenPositive = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = array[i];
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
                evenCount++;
                if (currentNumber > 0) {
                    if (currentNumber < minEvenPositive) {
                        minEvenPositive = currentNumber;
                        minEvenPositiveIndex = i;
                    }
                    if (currentNumber > maxEvenPositive) {
                        maxEvenPositive = currentNumber;
                        maxEvenPositiveIndex = i;
                    }
                }
            }
        }

        if (evenCount > 0) {
            double evenAverage = (double) evenSum / evenCount;
            System.out.println("Сумма четных чисел: " + evenSum);
            System.out.println("Количество четных чисел: " + evenCount);
            System.out.println("Среднее значение среди четных чисел: " + evenAverage);

            if (minEvenPositiveIndex != -1 && maxEvenPositiveIndex != -1) {
                // Меняем местами min и max значения
                int temp = array[minEvenPositiveIndex];
                array[minEvenPositiveIndex] = array[maxEvenPositiveIndex];
                array[maxEvenPositiveIndex] = temp;

                System.out.println("Массив после замены минимального и максимального значения:");
                for (int value : array) {
                    System.out.print(value + " ");
                }
            } else {
                System.out.println("В массиве нет положительных четных чисел.");
            }
        } else {
            System.out.println("В массиве нет четных чисел.");
        }
    }
}