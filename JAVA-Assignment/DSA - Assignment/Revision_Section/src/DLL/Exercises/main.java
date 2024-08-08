package DLL.Exercises;

public class main {
    public static void main(String[] args) {
        DLL myList = new DLL(4);

//        Append
        myList.append(5);

//        Remove Last
//        myList.removeLast();

//        Prepend
        myList.prepend(3);

//        Remove First
//        myList.removeFirst();

//        Get index
//        System.out.println(myList.get(0).value + "\n");

//        Set
//        myList.set(0,7);

//        insert
        myList.insert(0,2);
        myList.remove(2);



        myList.printList();
    }
}
