package Stack;

public class CallStack {

    static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName) {
            this.functionName = functionName;
            this.next = null;
        }
    }

    private Frame top;

    public void push(String functionName) {
        Frame newFrame = new Frame(functionName);
        newFrame.next = top;
        top = newFrame;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Call Stack is Empty");
        }

        String name = top.functionName;
        top = top.next;

        return name;
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Call Stack is Empty");
        }

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Frame temp = top;

        System.out.println("Call Stack:");

        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validate()");
        stack.push("checkPassword()");

        stack.display();

        System.out.println("\nCurrent Function : " + stack.peek());

        System.out.println("\nReturn : " + stack.pop());

        stack.display();
    }
}