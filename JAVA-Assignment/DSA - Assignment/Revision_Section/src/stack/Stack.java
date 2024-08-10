package stack;

import org.w3c.dom.Node;

public class Stack {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
//    Create a Stack
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

//    Stack ->  Push
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


    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value + " <- ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
