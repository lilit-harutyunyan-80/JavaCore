package homework.homework5;

public class ArrayExampleDemo {

    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        char[] chars = {' ', ' ', ' ', ' ', 'H', 'e', ' ', 'l', 'l', 'o', ' ', ' ',};
        ae.trim(chars);
        System.out.println();

        int[] numbers = {4, 3, 5, 6, 1, 8, 9, 0};
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        ae.sort(numbers);
    }
}
