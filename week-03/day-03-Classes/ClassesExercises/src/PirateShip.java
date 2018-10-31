import java.util.ArrayList;

public class PirateShip {
    public static void main(String[] args) {
        ArrayList<Pirates> crew = new ArrayList<>();
        fillShip(crew);
        System.out.println();

        public static void fillShip(ArrayList crew){
            Pirates captain = new Pirates();
            Pirates pirate = new Pirates();
            int pirateNum = (int) (Math.random() * 100);
            crew.add(captain);
            for (int i = 0; i < pirateNum; i++) {
                crew.add(pirate);
            }
            System.out.println(pirateNum);
        }
    }
}
