import org.w3c.dom.Node;

public class LinkedList {
//    It Like pointer

    private Node head;
    private Node tail;
    private int length;

//    Node Create
    class Node {
        int value;
        Node next;

    // constructor
    Node(int value) {
        this.value = value;
    }
    }

//    Creating a LinkList

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

//    Append List
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail  = newNode;
        }
        length++;
    }

//    Remove Last
    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

//    Prepend method
    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

//    Remove First
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

//    Get a particular index
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

//    Set a value at particular index
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

//    insert at particular  in
    public boolean insert(int index, int value) {
        if (index < 0 || index > length ) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

//    reverse
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length ; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }



//    Printing a List
    public  void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;






        }
    }

//    public void getHead() {
//        System.out.println("Head: " + head.value);
//    }
//
//    public void getTail() {
//        System.out.println("Tail: " + tail.value);
//    }
//
//    public void getLength() {
//        System.out.println("Length: " + length);
//    }





}
