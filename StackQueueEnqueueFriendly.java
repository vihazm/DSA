package dsa;
import java.util.Stack;

public class StackQueueEnqueueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // ENQUEUE
    public void enqueue(int data) {
        s1.push(data);
        System.out.println("Enqueued: " + data);
    }

    // DEQUEUE
    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int dequeued = s2.pop();

        // Move remaining elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }

    public void display() {
        System.out.println("Queue elements : " + s1);
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
