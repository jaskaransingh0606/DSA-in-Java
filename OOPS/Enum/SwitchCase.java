
enum Result {
    PASS, FAIL, NR;
}

public class SwitchCase {
    public static void main(String[] args) {

        Result r = Result.PASS;

        switch (r) {
            case PASS:
                System.out.println("Pass");
                break;
            case FAIL:
                System.out.println("Fail");
                break;
            case NR:
                System.out.println("Not Rated");
                break;

        }

    }

}
