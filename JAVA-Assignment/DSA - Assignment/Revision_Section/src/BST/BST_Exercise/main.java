package BST.BST_Exercise;

public class main {
    public static void main(String[] args) {
        BST myBST = new BST();
        myBST.insert(47);
        myBST.insert(34);
        myBST.insert(45);
        myBST.insert(78);
        myBST.insert(56);

//        System.out.println(myBST.contains(78));
        System.out.println(myBST.root.left.right.value);
//        System.out.println("root:- " + myBST.root.value);



    }
}
