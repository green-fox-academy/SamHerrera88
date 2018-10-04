public class Sumdigit {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12)

    public static void main(String[] args) {
        System.out.println(sumOfDigit(500));
    }

    public static int sumOfDigit(int n) {
        int whatsLeft = n%10;

        if (n == 0) {
            return whatsLeft;
        } else {
            return whatsLeft+sumOfDigit(n/10);
        }
    }
}