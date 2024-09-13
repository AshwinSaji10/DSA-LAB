
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
public class Doubly_linked_list {

    static Scanner sc=new Scanner(System.in);
    Node head,tail;
    static class Node
    {
        int data;
        Node prev;
        Node next;
        
        Node(int d)
        {
            this.data=d;
            this.prev=null;
            this.next=null;
        }
    }
    public static Doubly_linked_list insert_start(Doubly_linked_list list,int data)
    {
        Node new_node=new Node(data);
        
        if(list.head==null)//empty list
        {
            list.head=new_node;
            list.tail=new_node;
        }
        else
        {
            new_node.next=list.head;
            list.head.prev=new_node;
            list.head=new_node;//set new head
           
        }
        
        return list;
    }
    
    public static Doubly_linked_list insert_end(Doubly_linked_list list,int data)
    {
        Node new_node=new Node(data);
        
        if(list.tail==null)
        {
            list.head=new_node;
            list.tail=new_node;
        }
        else
        {
            list.tail.next=new_node;
            new_node.prev=list.tail;
            list.tail=new_node;//set new tail
            
        }
        
        return list;
    }
    
    public static Doubly_linked_list insert_pos(Doubly_linked_list list,int index)
    {
        int val;
        System.out.println("Enter data to insert at index:");
        val=sc.nextInt();
        
        //insert at beginning
        if(index==0)
        {
            list=insert_start(list,val);
            return list;
        }
        
        Node new_node=new Node(val);
        
        Node temp=list.head;
        for(int i=0;i<index;i++)
        {
            if(temp.next==null){//insert at end
                list=insert_end(list,val);
                return list;
            }
            temp=temp.next;
        }
        
        
        
        //insert at index
        temp.prev.next=new_node;
        new_node.prev=temp.prev;
        
        new_node.next=temp;
        temp.prev=new_node;
        
        return list;
    }
    public static Doubly_linked_list insert_before(Doubly_linked_list list,int data)
    {
        int val;
        System.out.println("Enter value to insert before:");
        val=sc.nextInt();
        Node new_node=new Node(val);
        
        Node temp=list.head;
        int flag=0;
        
        //empty list case
        if(temp==null)
        {
            System.out.println("Empty list");
            return list;
        }
        
        //search for that element;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                flag=1;
                break;
            }
            temp=temp.next;
        }

        if(flag==0)
        {
            System.out.println("Element not found");
        }
        else if(list.head.data==data)
        {
            list=insert_start(list,val);
        }
        else//insert before element
        {
            temp.prev.next=new_node;
            new_node.prev=temp.prev;

            new_node.next=temp;
            temp.prev=new_node;
        }
                  
        
        return list;
    }
    public static Doubly_linked_list insert_after(Doubly_linked_list list,int data)
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
            return list;
        }
        
        //search for that element;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                flag=1;
                break;
            }
            temp=temp.next;
        }
        
        if(flag==0)
        {
            System.out.println("Element not found");
        }
        else if(list.tail.data==data)
        {
            list=insert_end(list,val);
        }
        else
        {
            temp.next.prev=new_node;
            new_node.next=temp.next;

            temp.next=new_node;
            new_node.prev=temp;
            
        }
                  
        
        return list;
    }
    public static Doubly_linked_list delete_pos(Doubly_linked_list list,int index)
    {
        
        if(list.head==null)//empty list
        {
            System.out.println("Empty linkedlist");
            
            return list;
        }
        else if(index>(retsize(list)-1)||index<0)//invalid index
        {
            System.out.println("Element at "+index+" does not exist");
        }
        else if(index==(retsize(list)-1))//last element
        {
            list=delete_end(list);
        }
        else if(list.head==list.tail&&index==0)//single element to delete
        {
            list=delete_end(list);
        }
        else if(index==0 && (retsize(list)-1)>1)//first element
        {
            Node temp=list.head;
            list.head=temp.next;
            temp.next.prev=null;
            temp.next=null;
        }
        else//random index between head and tail
        {
            Node temp=list.head;
            for(int i=0;i<index;i++)//go to index in list
                temp=temp.next;
            
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            
            temp.prev=null;
            temp.next=null;
            
          
        }
        
        return list;
    }
    
    public static Doubly_linked_list delete_end(Doubly_linked_list list)
    {
        
        if(list.tail==null){
            
            System.out.println("Empty linkedlist");
            
        }
        else if(list.head==list.tail){//single element
            list.head=null;
            list.tail=null;
        }
        else{
            Node temp=list.tail;
            list.tail=list.tail.prev;
            list.tail.next=null;
            temp.prev=null;
        }
        
        return list;
    }
    public static void display(Doubly_linked_list list)
    {
        Node temp=list.head;
        
        System.out.println("displaying linkedlist:");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("\n");
        
    }
    public static int retsize(Doubly_linked_list list)
    {
        Node temp=list.head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        
        return count;
        
    }
    public static void main(String args[])
    {
        Doubly_linked_list list=new Doubly_linked_list();
        
        int ch;
        
        do
        {
            
            System.out.println("""
                               1.insert at rear
                               2.delete from rear
                               3.insert at position
                               4.delete from position
                               5.insert after
                               6.insert before
                               7.display
                               8.exit""");
            ch=sc.nextInt();
            int n;
            switch(ch)
            {
                case 1 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=insert_end(list,n);
                }
                case 2 -> {
                    list=delete_end(list);
                }
                case 3 -> {
                    System.out.println("enter index to insert at");
                    n=sc.nextInt();
                    list=insert_pos(list,n);
                }
                case 4 -> {
                    System.out.println("enter index to delete from");
                    n=sc.nextInt();
                    list=delete_pos(list,n);
                }
                case 5 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=insert_after(list,n);
                }
                case 6 -> {
                    System.out.println("enter number");
                    n=sc.nextInt();
                    list=insert_before(list,n);
                }
                case 7 -> {
                    display(list);
                }
                case 8 -> {System.out.println("Exiting..");}
                default->{System.out.println("Wrong Choice");}
                
            }            
        }while(ch!=8);
        
    }
}
