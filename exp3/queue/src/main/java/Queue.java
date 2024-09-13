/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
public class Queue {

    final static int MAX = 20;
    static int queue[] = new int[MAX];
    static int front=-1, rear=-1;

//    Queue() {
//        front = rear = -1;
//    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(50);
        enqueue(6);
//        dequeue();
//        dequeue();
        display();

    }

    static void enqueue(int val) {

        if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = val;
        } else if (rear == MAX) {
            System.out.println("queue is full");
        } else {
            rear++;
            queue[rear] = val;
        }

    }

    static void dequeue() {
        if (front == -1 && rear == -1) {

            System.out.println("queue is empty");

        } else if (front == rear) {
            System.out.println("removed " + queue[front]);
            front = rear = -1;

        } else {

            System.out.println("removed " + queue[front]);
            front++;

        }

    }

    static void display() {
        if (front == rear) {
            System.out.println("Empty Queue");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
