/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;
import java.util.Stack;

public class StackQueueDequeueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // ENQUEUE (O(n))
    public void enqueue(int data) {
        // Move all elements to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new element
        s1.push(data);

        // Move back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        System.out.println("Enqueued: " + data);
    }

    // DEQUEUE (O(1))
    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return s1.pop();
    }

    public static void main(String[] args) {
        StackQueueDequeueFriendly queue = new StackQueueDequeueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}

