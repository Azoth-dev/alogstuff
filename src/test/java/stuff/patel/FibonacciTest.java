package stuff.patel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void test1(){
        Fibonacci fibonacci = new Fibonacci();
        assertArrayEquals(fibonacci.printFibonacci(2),new int[]{0,1});
        assertArrayEquals(fibonacci.printFibonacci(1),new int[]{0});
        assertArrayEquals(fibonacci.printFibonacci(0),null);
        assertArrayEquals(fibonacci.printFibonacci(7),new int[]{0,1,1,2,3,5,8});
        assertArrayEquals(fibonacci.printFibonacci(10),new int[]{0,1,1,2,3,5,8});
    }

}