package homework.homework1.homework9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text = "Hello (from) [Java}";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
