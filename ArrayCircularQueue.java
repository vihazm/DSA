/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;
public class ArrayCircularQueue {

    int[] queue;
    int front, rear, size, capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        size = 0;
        rear = -1;
    }

    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(40);
    }
}
