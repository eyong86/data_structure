/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

/**
 *
 * @author 0wner
 */
public class NumericFunctions {
    public static int factorial(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            System.out.print(n);
            System.out.print("");
            System.out.println(factorial(n));
        }
    }
}
