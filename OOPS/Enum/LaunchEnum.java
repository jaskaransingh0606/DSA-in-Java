
public class LaunchEnum {

    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        enum Result {
            PASS, FAIL
        }

        Week day = Week.MONDAY;
        System.out.println(day);

        Result re = Result.PASS;
        System.out.println(re);

        Week[] week = Week.values(); // values() method returns an array of enum type containing all the enum constants
        for (Week w : week) {
            System.out.println(w);
        }

    }

}
