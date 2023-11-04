import java.util.Scanner;

class Guesser {
    int GuesserNum;

    public int takeNumberGuesser() {
        System.out.println("Guesser enter your number");
        Scanner sc = new Scanner(System.in);
        GuesserNum = sc.nextInt();

        return GuesserNum;
    }

}

class Player {
    int PlayerNum;

    public int takeNumberPlayer() {
        System.out.println("Player enter your number");
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();

        return PlayerNum;
    }

}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.takeNumberGuesser();

    }

    public void collectFromPlayer1() {
        Player p1 = new Player();
        numFromPlayer1 = p1.takeNumberPlayer();
    }

    public void collectFromPlayer2() {
        Player p2 = new Player();
        numFromPlayer2 = p2.takeNumberPlayer();
    }

    public void collectFromPlayer3() {
        Player p3 = new Player();
        numFromPlayer3 = p3.takeNumberPlayer();
    }

    public void compare() {
        if (numFromPlayer1 == numFromGuesser) {
            if (numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
                System.out.println("All players win");
            } else if (numFromPlayer2 == numFromGuesser) {
                System.out.println("Player 1 and Player 2 win");
            } else if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Player 1 and Player 3 win");
            } else {
                System.out.println("Only Player 1 wins");
            }
        } else if (numFromPlayer2 == numFromGuesser) {
            if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Player 2 and Player 3 win");
            } else {
                System.out.println("Only Player 2 wins");
            }

        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Only Player 3 wins");
        } else {
            System.out.println("No one wins");
        }
    }

}

public class GuesserGameProject {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayer1();
        u.collectFromPlayer2();
        u.collectFromPlayer3();
        u.compare();

    }

}
