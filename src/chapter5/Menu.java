package chapter5;

import java.sql.SQLOutput;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Օպերատորին միանալու ցանկ");
            System.out.println("     1.  if");
            System.out.println("     2.  switch");
            System.out.println("     3.  while");
            System.out.println("     4.  do-while");
            System.out.println("     5.  for\n");
            System.out.println("Ընտրեք որևէ տարբերակ:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(պայմանի) օպերատորին;");
                System.out.println("else օպերատորին;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(արտահայտության) {");
                System.out.println(" case մշտականին");
                System.out.println("օպերատորի հաջորդականությունին");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:/n");
                System.out.println("while (պայմանի) օպերատորին;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do  {");
                System.out.println("   օպերատորին;");
                System.out.println("} while (պայմանի);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.print("for (սկզբնավորում; վիճակ; կրկնություն)");
                System.out.println("  օպերատորին;");
                break;
        }
    }
}
