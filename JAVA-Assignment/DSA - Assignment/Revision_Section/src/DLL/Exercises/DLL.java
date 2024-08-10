package DLL.Exercises;

public class DLL {
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
//    Creating List
    public  DLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

//    Append
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = null;
            tail = null;
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

//    Remove First
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 0) {
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
            for (int i = 0; i < index; i++) {
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

//    Insert
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
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) removeFirst();
        if (index == length - 1) removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
    //    Swap first and Last Node
    public void swap() {
//        if length is 0
//        if (length == 0) {
//            head = null;
//            tail = null;
//        }
        if (head == null || head == tail) {
            return;
        }

//        two element exist
        if (head.next == tail) {
           Node temp = head;
            head = tail;
            tail = temp;
            head.next = tail;
            tail.prev = head;
            head.prev = null;
            tail.next = null;
            return;
        }
        Node first = head;
        Node last = tail;

//        Update reference
        head = last;
        tail = first;

        if (first.next != last) {
           Node firstNext = first.next;
           Node lastPrev = last.prev;

//            Reconnect and previous Node
            firstNext.prev = last;
            lastPrev.next = first;

//            Swap the next pointer
            head.next = firstNext;
            tail.next = null;

//            Swap the pre pointer
            tail.prev = lastPrev;
            head.prev = null;
        }else {
//            if first and last are adjacent
          Node firstNext = first.next;
            head.next = first;
            tail.next = null;

            tail.prev = last;
            head.prev = null;

            head.next.prev = head;
        }
    }

//    Printing a List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
