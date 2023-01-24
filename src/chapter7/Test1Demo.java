package chapter7;

public class Test1Demo {

    public static void main(String[] args) {
        Test1 ob = new Test1();

        ob.a = 10;
        ob.b = 20;

        ob.setc(100);
        System.out.println("a, b, i c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
