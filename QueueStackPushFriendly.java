package dsa;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPushFriendly {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // PUSH
    public void push(int data) {
        q1.add(data);
        System.out.println("Pushed: " + data);
    }

    // POP 
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        // Move elements except last to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Last element is the stack top
        int popped = q1.remove();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public void display() {
        System.out.println("Current Stack (top at right): " + q1);
    }

    public static void main(String[] args) {
        QueueStackPushFriendly stack = new QueueStackPushFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
