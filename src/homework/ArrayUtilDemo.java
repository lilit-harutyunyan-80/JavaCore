package homework;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {2, 8, 24, 68, 12, 85, 44, 21, 99, 102, 16};
        ArrayUtil au = new ArrayUtil();
        au.sumOfArray(array);
        au.maxOfArray(array);
        au.minOfArray(array);
        au.evenOfArray(array);
        System.out.println();
        au.oddOfArray(array);
        au.numberEvenArray(array);
        au.numberOddArray(array);
    }
}
