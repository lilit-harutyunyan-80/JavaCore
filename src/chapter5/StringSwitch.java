package chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "Երկու";
        switch (str) {
            case "մեկ":
                System.out.println("մեկ");
                break;
            case "Երկու":
                System.out.println("երկու");
                break;
            case "երեք":
                System.out.println("երեք");
                break;
            default:
                System.out.println("Չի համընկնում ոչ մեկին");
                break;
        }
    }

}
