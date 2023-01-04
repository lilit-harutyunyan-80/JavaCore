package chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Ձմռան";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Գարնան";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Ամռան";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Աշնան";
        } else
            season = "Այդպիսի ամիս չկա";

        System.out.println("Ապրիլը " + season + " ամիս է:");

    }

}
