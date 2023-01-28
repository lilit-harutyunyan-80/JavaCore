package homework.homework1.homework9;
import java.util.Stack;
public class BraceChecker {
    private final String text;
    private final Stack stack = new Stack();

    BraceChecker(String text) {
        this.text = text;
    }


    public void check() {

        char chack;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    chack = (char) stack.pop();
                    if (chack == '{' || chack == '[') {
                        System.out.println("opened " + chack + "but close " + c + "in index " + i);
                    } else if (chack != '(') {
                        System.out.println("Error closed " + chack + "but not opened");
                    }
                    break;
                case ']':
                    chack = (char) stack.pop();
                    if (chack == '(' || chack == '{') {
                        System.out.println("opened " + chack + "but close " + c + "in index " + i);
                    } else if (chack != '[') {
                        System.out.println("Error closed " + chack + "but not opened");
                    }
                    break;
                case '}':
                    chack = (char) stack.pop();
                    if (chack == '(' || chack == '[') {
                        System.out.println("opened " + chack + "but close " + c + "in index " + i);
                    } else if (chack != '[') {
                        System.out.println("Error closed " + chack + "but not opened");
                    }
                    break;

            }
        }
        while((chack = (char) stack.pop())!=0){
            System.out.println("error opened " + chack + "but not closed");
        }
    }
}

