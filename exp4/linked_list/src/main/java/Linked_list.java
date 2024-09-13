/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
import java.util.Scanner;
public class Linked_list 
{

    static Scanner sc=new Scanner(System.in);
    Node head;
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
        }
    }
    public static Linked_list insert_start(Linked_list list,int data)
    {
        Node new_node=new Node(data);
        
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            new_node.next=list.head;
            list.head=new_node;
           
        }
        
        return list;
    }
    
    public static Linked_list insert_end(Linked_list list,int data)
    {
        Node new_node=new Node(data);
        
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            Node temp=list.head;
            while(temp.next!=null)
                temp=temp.next;
            
            temp.next=new_node;
            
        }
        
        return list;
    }
    public static Linked_list insert_before(Linked_list list,int data)
    {
        int val;
        System.out.println("Enter data to insert before:");
        val=sc.nextInt();
        Node new_node=new Node(val);
        
        Node temp=list.head,prev=null;
        int flag=0;
        if(temp==null)
        {
            //empty
            System.out.println("Empty list");
        }
        else if(temp.data==data)//single element
        {
            new_node.next=temp;
            list.head=new_node;
            flag=1;
        }
        else
        {
            while(temp!=null)
            {
                if(temp.data==data)
                {
                    prev.next=new_node;
                    new_node.next=temp;
                    flag=1;
                }
                prev=temp;
                temp=temp.next;

            }
        }

        if(flag==0)
        {
            System.out.println("Element not found");
        }
                  
        
        return list;
    }
    public static Linked_list insert_after(Linked_list list,int data)
    {
        int val;
        System.out.println("Enter data to insert after:");
        val=sc.nextInt();
        Node new_node=new Node(val);
        
        Node temp=list.head;
        int flag=0;
        if(temp==null)
        {
            //empty
            System.out.println("Empty list");
        }
        else if(temp.data==data)//single element
        {           
            temp.next=new_node;
            new_node.next=null;
            flag=1;
        }
        else
        {
            while(temp!=null)
            {
                if(temp.data==data)
                {
                    new_node.next=temp.next;
                    temp.next=new_node;
                    flag=1;
                }               
                temp=temp.next;

            }
        }

        if(flag==0)
        {
            System.out.println("Element not found");
        }
                  
        
        return list;
    }
    public static Linked_list delete(Linked_list list,int data)
    {
        
        if(list.head==null)
        {
            System.out.println("Empty linked list");
        }
        else
        {
            Node temp=list.head,prev=null;
            int flag=0;
            if(list.head==null)//empty list
            {
                System.out.println("empty linked list");
                return list;
            }
            else if(list.head.data==data)//single element
            {   
                prev=list.head;
                list.head=list.head.next;
                prev.next=null;
                flag=1;
            }
            else
            {
                while(temp!=null)
                {
                    if(temp.data==data)
                    {
                        prev.next=temp.next;
                        temp.next=null;
                        flag=1;
                        break;
                    }
                    prev=temp;
                    temp=temp.next;

                }
            }
            if(flag==0)
            {
                System.out.println("element not found!");
            }
                        
        }
        
        return list;
    }
    public static void display(Linked_list list)
    {
        Node temp=list.head;
        
        System.out.println("displaying linkedlist:");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("\n");
        
    }
    public static void main(String args[])
    {
        Linked_list list=new Linked_list();
        
        int ch;
        
        do
        {
            
            System.out.println("""
                               1.insert at beginning
                               2.insert at end
                               3.insert after
                               4.insert before
                               5.delete
                               6.display
                               7.exit""");
            ch=sc.nextInt();
            int n;
            switch(ch)
            {
                case 1 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=insert_start(list,n);
                }
                case 2 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=insert_end(list,n);
                }
                case 3 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=insert_after(list,n);
                }
                case 4 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=insert_before(list,n);
                }
                case 5 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=delete(list,n);
                }
                case 6 -> {
                    display(list);
                }
                case 7 -> {System.out.println("Exiting..");}
                default->{System.out.println("Wrong Choice");}
                
            }
            
            
        }while(ch!=7);
        
    }
}
