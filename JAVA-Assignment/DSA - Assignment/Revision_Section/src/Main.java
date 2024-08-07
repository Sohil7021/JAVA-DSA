public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(0);
        myList.append(3);
        myList.append(4);
        myList.append(5);
//        System.out.println(myList.removeLast().value);
        System.out.println("Get index:-");
        System.out.println(myList.set(2,7) + "\n");
        myList.reverse();


//        myList.removeFirst();
//        myList.removeFirst();




        myList.printList();


    }


}