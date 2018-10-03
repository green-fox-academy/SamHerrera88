import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Dominoes1> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...


        for (int i = 0; i < dominoes.size(); i++) {
            for (int j = 1; j < dominoes.size(); j++) {
                if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
                    dominoes.add(i + 1, dominoes.get(j));
                    dominoes.remove(j + 1);
                }
            }
        }

        System.out.println(dominoes);

    }

    static List<Dominoes1> initializeDominoes() {
        List<Dominoes1> dominoes = new ArrayList<>();
        dominoes.add(new Dominoes1(5, 2));
        dominoes.add(new Dominoes1(4, 6));
        dominoes.add(new Dominoes1(1, 5));
        dominoes.add(new Dominoes1(6, 7));
        dominoes.add(new Dominoes1(2, 4));
        dominoes.add(new Dominoes1(7, 1));
        return dominoes;
    }
}