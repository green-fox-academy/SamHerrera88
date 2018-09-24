public class PrintParams {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters
    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    public static void main(String[] args) {
        String args1 = "Sam";
        String args2 = "Bo";
        String args3 = "Is";
        String args4 = "Here";

        printParams(args1, args2, args3, args4);
    }
    public static void printParams(String... args){


        for (String strings : args){
            System.out.println(strings);

        }
    }
}