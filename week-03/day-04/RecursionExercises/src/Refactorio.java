public class Refactorio {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial
    public static void main(String[] args) {
        int n = 7;
        System.out.println(refactorio(n));
    }
    public static int refactorio(int n){
        if (n ==1){
            return 1;
        } else {
            return refactorio(n-1)*n;
        }
    }
}
