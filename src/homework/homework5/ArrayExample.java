package homework.homework5;

import javax.swing.*;

public class ArrayExample {

    void trim(char[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int i = endIndex; i >= 0; i--) {
            if (array[i] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[j++] = array[i];
        }

        for (char c : result) {
            System.out.print(c);
        }
    }

    void sort(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
}
