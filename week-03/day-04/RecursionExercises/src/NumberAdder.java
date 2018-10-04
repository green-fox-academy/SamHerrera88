public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main(String[] args) {
        System.out.println(addNum(5));
    }

    public static int addNum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return addNum(n - 1)+ n;
        }
    }
}

