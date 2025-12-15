/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Vihas
 */
public class UnboundedArrayStack {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public UnboundedArrayStack(int initialCapacity) {
        capacity = initialCapacity;
        stack = new int[capacity];
        top = -1;
    }

    // PUSH operation
    public void push(int data) {
        // Resize if stack is full
        if (top == capacity - 1) {
            resize(capacity * 2);
        }

        stack[++top] = data;
        System.out.println("Pushed: " + data);
    }

    // POP operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        int popped = stack[top--];

        // Shrink if stack is quarter full
        if (top + 1 > 0 && top + 1 <= capacity / 4) {
            resize(capacity / 2);
        }

        return popped;
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Resize stack
    private void resize(int newCapacity) {
        System.out.println("Resizing from " + capacity + " to " + newCapacity);

        int[] newStack = new int[newCapacity];

        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        capacity = newCapacity;
    }

    // Display stack
    public void display() {
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack(2);

        stack.push(10);
        stack.push(20);
        stack.push(30); // resize to 4

        stack.display();

        stack.pop();
        stack.pop(); // resize to 2

        stack.display();
    }
}
