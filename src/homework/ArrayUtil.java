package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 6, 9, 11, 36, 24, 85, 12, 26, 31,};

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }
        System.out.println();
        System.out.println("Min is: " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println();
        System.out.println("max is: " + max);
    }

}

