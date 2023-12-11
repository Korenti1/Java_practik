import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        float[] array = new float[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextFloat()) {
                System.out.println("Ошибка! Введите число:");
                scanner.next();
            }
            array[i] = scanner.nextFloat();
        }

        int minIndex = -1;
        float min = Float.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] < 0 && array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        if (minIndex != -1) {
            System.out.println("Минимальный отрицательный элемент: " + min + ", его индекс: " + minIndex);
        } else {
            System.out.println("Отрицательные элементы отсутствуют.");
        }
    }
}