package interview.practice.datastructure;

import java.util.Stack;

public class QueueUsingStack {

    static class Queue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;

    }

    static void push(Stack<Integer> stack, int new_data) {
        stack.push(new_data);
    }

    static int pop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is underflow");
            System.exit(0);
        }

        return stack.pop();

    }

    static void enqueue(Queue q, int item) {
        push(q.stack1, item);
    }

    static int dequeue(Queue q) {
        int x;
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {

            System.out.println("Queue is empty");
            System.exit(0);
        }

        if (q.stack2.isEmpty()) {

            while (!q.stack1.isEmpty()) {
                x = pop(q.stack1);
                push(q.stack2, x);
            }
        }
        x = pop(q.stack2);
        return x;
    }
    
    public static void main(String[] args) {
        Queue queue= new Queue();
        queue.stack1 = new Stack();
        queue.stack2 = new Stack();
        
        enqueue(queue, 1);
        enqueue(queue, 2);
        enqueue(queue, 3);
        enqueue(queue, 4);
        
        System.out.println(dequeue(queue));
        System.out.println(dequeue(queue));
        System.out.println(dequeue(queue));
        System.out.println(dequeue(queue));
    }
}
