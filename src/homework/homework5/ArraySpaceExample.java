package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'o', 'b', ' ', ' '};

        int firstIndex = 0;
        int lastIndex = spaceArray.length - 1;
        while(firstIndex < lastIndex && spaceArray[firstIndex] == ' '){
            firstIndex++;
        }
        while (firstIndex < lastIndex && spaceArray[lastIndex] == ' '){
            lastIndex--;
        }
        char[] result = new char[(lastIndex - firstIndex) + 1];
        int index = 0;
        for (int i = firstIndex; i < lastIndex + 1; i++){
            result[index++] = spaceArray[i];
        }
        System.out.println(result);
    }

}
