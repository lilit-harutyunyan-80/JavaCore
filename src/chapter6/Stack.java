package chapter6;

import java.sql.SQLOutput;

public class Stack {

    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Steck zapolnen. ");
         else stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stek ne zagrujon. ");
            return 0;
        } else return stck[tos--];
    }
}
