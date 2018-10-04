public class BunniesToo {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(numOfEars(4));
    }
    public static int numOfEars (int numOfBuns ){
        if (numOfBuns == 0){
            return 0;
        } else if (numOfBuns % 2 !=0){
            return 3 + numOfEars(numOfBuns-1);
        }else{
            return 2 + numOfEars(numOfBuns-1);
        }
    }
}