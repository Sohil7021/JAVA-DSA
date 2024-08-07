package LinkList_Exercices;

public class main {
    public static void main(String[] args) {
        Linked_List myList = new Linked_List(4);

        myList.append(5);

//        myList.removeLast();

        myList.prepend(1);
//        myList.removeFirst();
        System.out.println("Get Index:- " + myList.get(1).value + "\n");


        myList.printList();
    }





}
