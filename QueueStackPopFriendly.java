package dsa;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPopFriendly {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // PUSH
    public void push(int data) {
        //Add new element to q2
        q2.add(data);

        //Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        //Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println("Pushed: " + data);
    }

    // POP
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return q1.remove();
    }

    public void display() {
        System.out.println("Current Stack (top at front): " + q1);
    }

    public static void main(String[] args) {
        QueueStackPopFriendly stack = new QueueStackPopFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
