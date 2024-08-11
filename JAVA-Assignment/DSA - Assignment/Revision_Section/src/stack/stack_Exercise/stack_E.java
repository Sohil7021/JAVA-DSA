package stack.stack_Exercise;

public class stack_E {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
//    Creating Stack
    public  stack_E(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height++;
    }

//    Push

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

//    pop
    public Node pop() {
        if (height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }


//    Printing Stack List

    public void printStack() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }





}
