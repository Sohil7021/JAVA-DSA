package stack.stack_Exercise;

public class main {
    public static void main(String[] args) {
        stack_E myStack = new stack_E(1);

//        push
        myStack.push(2);
        myStack.push(3);

//        pop
        myStack.pop();

        myStack.printStack();
    }
}
