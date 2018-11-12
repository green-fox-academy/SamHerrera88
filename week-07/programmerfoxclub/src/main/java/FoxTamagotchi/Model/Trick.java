package FoxTamagotchi.Model;

public enum Trick {
    cook("Cook vegan"),
    sing("Sing opera"),
    workout("Yoga"),
    dance("Dance salsa"),
    read("Read book"),
    paint("Paint self-portrait"),
    Java("code in Java"),
    pray("Breath in the Spirit");

    private static String value;

    Trick(String value){
//        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }


}
