package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int firstSymbol = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                firstSymbol++;
            }
        }
        System.out.println(firstSymbol);
        System.out.println();


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print("Two middle symbols in chars array: " + chars2[chars2.length / 2 - 1] + " and ");
        System.out.println(chars2[chars2.length / 2]);
        System.out.println();


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.println(true);
        } else System.out.println(false);
        System.out.println();


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }

    }
}
