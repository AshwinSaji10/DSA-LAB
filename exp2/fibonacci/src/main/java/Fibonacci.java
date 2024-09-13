/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
public class Fibonacci {

    public static void main(String[] args) {
        int a=10;
//        System.out.print(fib(a));
        
        for(int i=0;i<a;i++){
            System.out.print(fib(i)+" ");
        }
        
    }
    static int fib(int n){
        if(n==0||n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}
