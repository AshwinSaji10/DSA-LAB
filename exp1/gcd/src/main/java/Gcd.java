/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
import java.util.Scanner;
public class Gcd {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number");
        int a=sc.nextInt();
        System.out.print("Enter the second number");
        int b=sc.nextInt();
        int small,gcf=0;
        if(a<b)
            small=a;
        else
            small=b;
        
        for(int i=1;i<=small;i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcf=i;
            }
        }
        
        System.out.println(gcf);
            
        
    }
}
