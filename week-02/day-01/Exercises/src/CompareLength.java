import java.util.ArrayList;
public class CompareLength
{

    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`
    public static void main(String[] args) {
        int [] p1 = {1,2,3};
        int [] p2 = {4,5,8,9};

        int size1 =p1.length;
        int size2 =p2.length;

        System.out.println(size2 > size1 ? "p2 has more values than p1" : "p2 has less values than p1");
    }
}

