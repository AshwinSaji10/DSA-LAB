/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
public class Factorial {

    public static void main(String[] args) {
        int a=6;
        System.out.print(fact(a));
    }
    static int fact(int n)
    {
        if(n==0||n==1)
            return n;
        else
            return n*fact(n-1);
    }
}
