/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package company.binary_tree;

/**
 *
 * @author mca
 */
public class Binary_tree {

    static class Node{
        int key;
        Node left,right;
        public Node(int item){
            key=item;
            left=right=null;
        }
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
    static int count_leaf(Node node){
        
        if(node==null)
            return 0;
        else if(node.left==null && node.right==null)
            return 1;
        else
            return count_leaf(node.left)+count_leaf(node.right);
        
    }
    public static void main(String args[]){
        Node root=new Node(10);
        
        root.left=new Node(20);
        root.right=new Node(41);
        
        System.out.println("Inorder:");
        inorder(root);
        
        System.out.println("\nPreorder:");
        preorder(root);
        
        System.out.println("\nPostorder:");
        postorder(root);
        
        int c=count_leaf(root);
        System.out.println("\nNumber of leaf nodes = "+c);
    }
}
