public class Pirates {
    int rumLevel = 0;
    boolean isPassedOut = false;
    double luck = Math.random();

    public void drinkSomeRum() {
        rumLevel++;
    }

    public void howItGoingMate() {
        if (isPassedOut) {
            System.out.printf("he is doneski");
        } else if (rumLevel <= 4) {
            System.out.printf("pour me anudder!");
        } else {
            System.out.printf("AAAarghh, i'ma pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        isPassedOut = true;
    }

    public void brawl(Pirates other) {
        if (luck <= 0.333) {
            isPassedOut = true;
        }
        if (other.luck <= 0.333) {
            other.isPassedOut = true;
        }
    }
}