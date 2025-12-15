/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;
import java.util.Stack;
/**
 *
 * @author Vihas
 */
public class StackQueueEnqueueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // ENQUEUE operation (O(1))
    public void enqueue(int data) {
        s1.push(data);
        System.out.println("Enqueued: " + data);
    }

    // DEQUEUE operation (O(n))
    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Front element of queue
        int dequeued = s2.pop();

        // Move remaining elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }

    // DISPLAY queue
    public void display() {
        System.out.println("Queue elements (front at left): " + s1);
    }

    public static void main(String[] args) {
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
