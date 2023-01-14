package homework;

public class ArrayUtil {

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }
        System.out.println("Min is: " + min);
    }

    void maxOfArray(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println("max is: " + max);
        System.out.println();
    }

    void numberEvenArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    void numberOddArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    void evenOfArray(int[] array) {

        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println();
        System.out.println("զույգերի քանակը = " + even);
    }

    void oddOfArray(int[] array) {

        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.println("կենտերի քանակը = " + odd);
        System.out.println();
    }

    void sumOfArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println();
    }

    void lastIndexArray(int[] array) {

        int lastIndex = array.length - 1;
        System.out.println(array[lastIndex]);
    }
}