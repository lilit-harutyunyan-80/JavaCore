package homework.homework8;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }


    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Սխալ ինդեքս");
            return -1;
        }
        return array[index];
    }

    void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public void set(int index, int value) {
        for (int i = 0; i < size; i++) {
            if (index == i) {
                array[i] = value;
            }
            System.out.print(array[i] + " ");
        }
    }

    public void addByIndex(int index, int value) {
        int newVal = value;
        for (int i = index; i < size + 1; i++) {
            int tmp = newVal;
            newVal = array[i];
            array[i] = tmp;
        }
    }

    public boolean exists(int value) {
        if (array.length < 0) {
            return true;
        }
        return false;
    }


    public int getIndexByValue(int value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == -1) {
                return 0;
            } else if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }
}

