import java.util.Stack;

public class Queue_using_two_stack {

    static class Queue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Enqueue operation
        void enqueue(int x) {
            stack1.push(x);
            System.out.println(x + " enqueued");
        }

        // Dequeue operation
        int dequeue() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // Move elements from stack1 to stack2 if needed
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        // Peek front element
        int peek() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();
        }

        // Check if queue is empty
        boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.peek());

        q.enqueue(40);

        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }
    }
}
