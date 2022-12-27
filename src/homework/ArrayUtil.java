package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 6, 9, 11, 36, 24, 85, 12, 26, 31,};

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }
        System.out.println();
        System.out.println("Min is: " + min);

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println();
        System.out.println("max is: " + max);
        System.out.println();

// Տպել մասիվի զույգ թվերը
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();

// Տպել մասիվի կենտ թվերը
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();

        //Տպել մասիվի զույգերի քանակը
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("զույգերի քանակը = " + even);

        //Տպել մասիվի կենտերի քանակը

        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.println("կենտերի քանակը = " + odd);
        System.out.println();

//Տպել մասիվի թվերի գումարը
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);
            System.out.println();


//Տպել մասիվի առաջին թիվը
            System.out.println(array[0]);
            System.out.println();


// Տպել մասիվի վերջին թիվը
            int lastIndex = array.length - 1;
            System.out.println(array[lastIndex]);


        }
    }












