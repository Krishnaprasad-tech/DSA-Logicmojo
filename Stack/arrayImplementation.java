package Stack;

public class arrayImplementation {
    int top = -1;
    int[] arr = new int[100];

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        return arr[top--];
    }

    public int top() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}