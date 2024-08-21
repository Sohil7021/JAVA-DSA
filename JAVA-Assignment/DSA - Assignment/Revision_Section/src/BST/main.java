package BST;

public class main {
    public static void main(String[] args) {
        Binary_Search_Tree myBST = new Binary_Search_Tree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

//        myBST.insert(27);

//        System.out.println( myBST.contains(18));
//        System.out.println(myBST.rContains(27));
//        System.out.println(myBST.minValue(myBST.root));

//        System.out.println("root = " + myBST.root);
//        System.out.println(myBST.root.left.value);
//        System.out.println(myBST.root.right.value);
//        System.out.println(myBST.root.left.right.value);

        System.out.println(myBST.BFS());

    }
}
