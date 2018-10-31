public class FibonacciTest {
    int fibonacciNum;
    String somethingElse;

    @Before
    public void beforeEach(){
        fibonacciNum = 3;
        somethingElse = "Nada";
    }
    @Test
    public void fibonacciTest(){
        assertEquals(fibonacciNum,Fibonacci.fib(4));
    }
    @Test
    public void fibonacciTestSomethingElse(){
        assertEquals(somethingElse, Fibonacci.fib(4));
    }
}
