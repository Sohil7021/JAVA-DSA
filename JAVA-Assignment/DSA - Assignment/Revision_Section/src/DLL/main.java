package DLL;

public class main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(8);
        myDLL.append(9);
//        myDLL.removeLast();
        myDLL.prepend(6);
//        myDLL.removeFirst();
//        System.out.println( myDLL.get(2).value);
//        myDLL.set(2,3);
        myDLL.insert(2,99);
        myDLL.removeIndex(2);
        myDLL.printList();
    }
}
