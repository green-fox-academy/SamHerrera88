import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private static Pokemon2 pokemon2;

    public static void main(String[] args) {
        initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon2 wildPokemon = new Pokemon2("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        System.out.print("I choose you, " + whichToChoose(wildPokemon));
    }

    private static List<Pokemon2> initializePokemons() {
        List<Pokemon2> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon2("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon2("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon2("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon2("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon2("Kingler", "water", "fire"));

        return pokemon;
    }

    public static String whichToChoose(Pokemon2 wildPokemon) {
        for (Pokemon2 choosen1 : initializePokemons()) {
            if (choosen1.isEffectiveAgainst(wildPokemon)) {
                return choosen1.name;
            }
        }
        return "none";
    }
}
