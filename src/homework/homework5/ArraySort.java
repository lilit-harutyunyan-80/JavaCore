package homework.homework5;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Թվերը ներկայացնել աճման կարգով");
        int[] numbers = {43, 55, 5, -9, 0, 12, 7, 65};
        int numOrder = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    numOrder = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = numOrder;
                }
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Թվերը ներկայացնել նվազման կարգով");
        int numOrderRevers = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    numOrderRevers = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = numOrderRevers;
                }
            }
            System.out.print(numbers[i] + " ");
        }
    }
}
