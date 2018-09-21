package ExercisesDay4;

import java.util.Scanner;

import static java.lang.Math.multiplyExact;
import static java.lang.Math.pow;

public class VariableMutation {
    public static void main(String[] args) {
    int a = 3;
        a += 10;
        System.out.println(a);

    int b = 100;
        b -= 7;
        System.out.println(b);

    int c = 44;
        c *= 2;
        System.out.println(c);

    int d = 125;
        d /= 5;
        System.out.println(d);

    int e = 8;
        //cube the value of 8
        double e2 = e;
        e2 = Math.pow(e2, 3);
        System.out.println(Math.round(e2));

    int f1 = 123;
    int f2 = 345;
        // f1 bigger than f2 T/F
        System.out.println(f1 > f2);


    int g1 = 350;
    int g2 = 200;
        //double of g2 bigger than g1
        System.out.println(g2*2 > g1);


    int h = 135798745;
        // does 11 have a divisor
        System.out.println(h % 11 == 0);


    int i1 = 10;
    int i2 = 3;
        //i1 higher than i2 squared and smaller than i2 cubed
        double i2_2 = i2;
        System.out.println(i1 > Math.pow(i2_2,2) && i1 < Math.pow(i2_2,3));



    int j =1521;
        // tell if j is diviable by 3 or 5
        System.out.println(j % 5 == 0 || j % 3 == 0);

    String k = "Apple";
        //fill K variable with it content 4 times
        for (int i = 0; i < 4; i++){
            k += k;
        }



    }
}
