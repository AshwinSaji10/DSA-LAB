/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package company.bst;

/**
 *
 * @author mca
 */
import java.util.Scanner;

public class Bst {

    static class Node{
        int  key;
        Node left,right;
        Node(int data){
            this.key=data;
            this.left=null;
            this.right=null; 
        }
    }
    
    static Node insert(Node root,int value)
    {
        if(root==null)
        {
            root=new Node(value);
            return root;
        }
        if(value<root.key)
            root.left=insert(root.left,value);
        else if(value>root.key)
            root.right=insert(root.right,value);
        
        return root;
    }
    static Node search(Node root,int value)
    {
        if(root==null)
            return null;
        if(root.key==value)
            return root;
        if(value<root.key)
            return search(root.left,value);
        
        return search(root.right,value);
        
    }
    static void inorder(Node node){
        
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.key+" ");
        inorder(node.right);       
    }
    static void preorder(Node node){
        if(node==null)
            return;
        System.out.print(node.key+" ");
        preorder(node.left);       
        preorder(node.right); 
    }
    static void postorder(Node node){
        if(node==null)
            return;
        postorder(node.left);
        postorder(node.right); 
        System.out.print(node.key+" ");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Node root=new Node(10);
        root=insert(root,12);
        root=insert(root,8);
        root=insert(root,14);
        root=insert(root,11);
        root=insert(root,4);
        root=insert(root,9);
        inorder(root);
        System.out.print("\n");
        preorder(root);
        System.out.print("\n");
        postorder(root);
        
        System.out.println("\nEnter element to search for:");
        int n=sc.nextInt();
        
        if((search(root,n))!=null)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
