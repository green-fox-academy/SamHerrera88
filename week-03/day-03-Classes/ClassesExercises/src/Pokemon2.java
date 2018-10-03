public class Pokemon2 {
    String name;
    String type;
    String effectiveAgainst;

    public Pokemon2(String name, String type, String effectiveAgainst) {
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;
    }

    boolean isEffectiveAgainst(Pokemon2 anotherPokemon) {
        return this.effectiveAgainst.equals(anotherPokemon.type);
    }
}