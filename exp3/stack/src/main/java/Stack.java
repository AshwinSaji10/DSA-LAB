/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
//import java.util.Scanner;
public class Stack {

    final static int MAX=20;
    static int stack[]=new int[MAX];
    static int top=-1;
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            int a=sc.nextInt();
//            
//        }
        push(5);
        push(10);
        push(15);
        pop();
        
        display();
        
        
    }
    static void push(int n){
        
        if(top==MAX)
        {
             System.out.println("stack is full");
            
        }
            
        else{
            top++;
            stack[top]=n;
        }
        
    }
    
    static void pop(){
        if(top==-1)
        {
            System.out.println("empty stack");
        }
        else{
            
            System.out.println("popped out "+stack[top]);
            top--;
            
        }
        
        
    }
    static void display(){
        
       for(int i=0;i<=top;i++){
           System.out.println(stack[i]);
       }
        
    }
}
