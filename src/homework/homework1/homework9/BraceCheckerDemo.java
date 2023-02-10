package homework.homework1.homework9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text = "(Hello [Java} ((2023" ;
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
