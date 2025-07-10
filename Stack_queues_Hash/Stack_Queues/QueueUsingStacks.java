import java.util.Stack;

class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void enqueue(int x) {
        input.push(x);
    }

    public int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.isEmpty() ? -1 : output.pop();
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}
