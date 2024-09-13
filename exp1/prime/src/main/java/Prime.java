/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
public class Prime {

    public static void main(String[] args) {
        int a=17,sum=0;
        for(int i=2;i<a/2;i++){
            if(a%i==0)
                sum++;
        }
        if(sum>0)
            System.out.println("Not prime");
        else
            System.out.println("Prime");
    }
}
