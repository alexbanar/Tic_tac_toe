package edu.alex.java;

/**
 * Created by Alex on 27-Jan-17.
 */
import org.jetbrains.annotations.Contract;

public class Math {

    static int add(int x, int y){
        return x + y;
    }


    /**
     * factorial(n) = 1*2*3*...n
     * @param n to calculate factorial for
     * @return the factorial of n (1*2*3*...n
     */
    static int factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
