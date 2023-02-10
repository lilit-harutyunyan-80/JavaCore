package chapter7;

public class Stack {

    private int stack[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stek zapolnen. ");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stek ne zagrujion. ");
            return 0;
        } else
            return stack[tos--];
    }
}
