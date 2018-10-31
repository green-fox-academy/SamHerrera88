import java.util.ArrayList;

public class Unique {

    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    public static void main(String[] args) {
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    }

    public static ArrayList<Integer> unique(int[] uniqueNum) {
        ArrayList<Integer> uni = new ArrayList<>();
        for (int i = 0; i < uniqueNum.length; i++) {
            if(!uni.contains(uniqueNum[i])){
                uni.add(uniqueNum[i]);
            }
        }
        return uni;
    }
}