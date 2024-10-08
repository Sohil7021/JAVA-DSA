package DLL;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }



    }
//    Create a list
    public DoublyLinkedList(int value) {
        Node newNOde = new Node(value);
        head = newNOde;
        tail = newNOde;
        length = 1;
    }

//    Append
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

//    Remove Last
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 0) {
            head = null;
            tail = null;

        }else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

//    Prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = null;
            tail = null;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

//    Remove first
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        }else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;

    }

//    Get
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index ; i++) {
                temp = temp.next;
            }
        }else {
            temp = tail;
            for (int i = length - 1; i > index ; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

//    Set
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

//    insert
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;

        return true;


    }

//    Remove
    public Node removeIndex(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;

    }





//    Print List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


}
