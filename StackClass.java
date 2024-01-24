import java.util.EmptyStackException;

public class StackClass {
    private int maxSize;       // Maximum size of the stack
    private int[] stackArray;  // Array to store the elements of the stack
    private int top;           // Index of the top element in the stack

    // Constructor to initialize the stack with the specified size
    public StackClass(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Initialize top to -1 to indicate an empty stack
    }

    // Method to add an element to the top of the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;  // Increment top and add the value to the stack
        } else {
            System.out.println("Stack overflow");  // Display an error message for stack overflow
        }
    }

    // Method to remove and return the element at the top of the stack
    public int pop() {
        if (top >= 0) {
            return stackArray[top--];  // Return the element at the current top index and decrement top
        } else {
            throw new EmptyStackException();  // Throw EmptyStackException for pop on an empty stack
        }
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        StackClass st = new StackClass(5);  // Create a stack with a maximum size of 5
        System.out.println("StackClass: " + st);
        showPush(st, 12);  // Push 12 onto the stack
        showPush(st, 50);  // Push 50 onto the stack
        showPush(st, 66);  // Push 66 onto the stack
        showPop(st);       // Pop an element from the stack
        showPop(st);       // Pop an element from the stack
        showPop(st);       // Pop an element from the stack

        try {
            showPop(st);  // Attempt to pop from an empty stack
        } catch (EmptyStackException e) {
            System.out.println("The StackClass is empty" + e);  // Handle EmptyStackException
        }
    }

    // Method to demonstrate pushing an element onto the stack
    static void showPush(StackClass st, int a) {
        st.push(a);  // Call the push method of the StackClass
        System.out.println("Push(" + a + ")");
        System.out.println("StackClass: " + st);
    }

    // Method to demonstrate popping an element from the stack
    static void showPop(StackClass st) {
        System.out.println("Pop -> .............");
        int a = st.pop();  // Call the pop method of the StackClass
        System.out.println(a);
        System.out.println("StackClass: " + st);
    }
}
