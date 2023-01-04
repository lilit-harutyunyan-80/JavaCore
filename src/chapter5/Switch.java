package chapter5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Ձմռան";
                break;
            case 3:
            case 4:
            case 5:
                season = "Գարնան";
                break;
            case 6:
            case 7:
            case 8:
                season = "Ամռան";
                break;
            case 9:
            case 10:
            case 11:
                season = "Աշնան";
                break;
            default:
                season = "Այդպիսի ամիս չկա";
        }
        System.out.println("Ապրիլը " + season + " ամիս է:");
    }
}
