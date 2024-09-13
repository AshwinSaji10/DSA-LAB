/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author mca
 */
public class Circular_queue {

    final static int MAX = 5;
    static int cq[] = new int[MAX];
    static int front = -1, rear = -1;

    static void enqueue(int val) {

        if (front == -1 && rear == -1) {
            front = rear = 0;
            cq[rear] = val;

        } else if (front == ((rear + 1) % MAX)) {
            System.out.println("Queue is full");

        } else {
            rear = (rear + 1) % MAX;
            cq[rear] = val;
        }

    }

    static void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");

        } else if (front == rear) {
            System.out.println("deleted " + cq[front]);
            front = rear = -1;

        } else {
            System.out.println("deleted " + cq[front]);
            front = (front + 1) % MAX;

        }

    }

    static void display() {
//        for (int i = front; i != rear; i = (i + 1) % MAX) {
//            System.out.print(cq[i] + " ");
//        }
        if(front==-1&&rear==-1){
            System.out.print("Empty queue");
        }
        int i = front;
        while (i != rear) {
            System.out.print(cq[i] + " ");
            i = (i + 1) % MAX;
        }
        System.out.print(cq[rear]);
//        System.out.print(cq[i] + " ");
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(50);
//        dequeue();
//        dequeue();
//        dequeue();
        enqueue(40);
        enqueue(90);
        enqueue(7);
        dequeue();
        enqueue(3);
        dequeue();
        enqueue(45);
        display();

    }
}
