package Stack;
public class UndoBuffer {

    private String[] data;
    private int top;

    // Constructor
    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    // Push operation
    public boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Undo Buffer is Full!");
            return false;
        }

        data[++top] = edit;
        return true;
    }

    // Pop operation
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo.");
        }

        return data[top--];
    }

    // Peek operation
    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Undo Buffer is empty.");
        }

        return data[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Undo Buffer is Empty.");
            return;
        }

        System.out.println("Undo Buffer:");

        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    // Main method
    public static void main(String[] args) {

        UndoBuffer buffer = new UndoBuffer(5);

        buffer.push("Typed Hello");
        buffer.push("Typed World");
        buffer.push("Deleted Line");
        buffer.push("Added Image");

        buffer.display();

        System.out.println("\nLatest Edit: " + buffer.peek());

        System.out.println("\nUndo: " + buffer.pop());

        System.out.println();

        buffer.display();
    }
}