package BST;

//import queue.Queue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Binary_Search_Tree {
     Node root;

   class Node {
       int value;
       Node left;
       Node right;

        Node(int value) {
           this.value = value;
       }

    }

    //    BST insert
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while (true) {

            if (newNode.value == temp.value) return false;

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

//    Contain
    public boolean contains(int value) {
//       if (root == null) return false;  Not need
       Node temp = root;

       while (temp != null) {
           if (value < temp.value) {
               temp = temp.left;
           } else if (value > temp.value) {
               temp = temp.right;
           }else {
               return true;
           }
       }
       return false;
    }

//    Recursion BST
    private boolean rContains(Node currentNode, int value) {
       if (currentNode == null) return false;

       if (currentNode.value == value) return true;
       if (value < currentNode.value) {
           return rContains(currentNode.left,value);
       }else {
           return rContains(currentNode.right,value);
       }
    }

    public boolean rContains(int value) {
       return rContains(root,value);
    }

//    Recursion Insert
    private Node rInsert(Node currentNode, int value) {
       if (currentNode == null) return new Node(value);
       if (value < currentNode.value) {
           currentNode.left = rInsert(currentNode.left,value);
       }else if (value > currentNode.value){
           currentNode.right = rInsert(currentNode.right,value);
       }

       return currentNode;
    }

    public void rInsert(int value) {
       if (root == null) root = new Node(value);
       rInsert(root,value);
    }

//    Delete Node Recursion
    private Node deleteNode(Node currentNode, int value) {
       if (currentNode == null) return null;
       if (value < currentNode.value) {
           currentNode.left = deleteNode(currentNode.left,value);
       } else {
           if (currentNode.left == null && currentNode.right == null) {
               return null;
           } else if (currentNode.left == null) {
               currentNode = currentNode.right;
           } else if (currentNode.right == null) {
               currentNode = currentNode.left;
           }else {
               int subTreeMin = minValue(currentNode.right);
               currentNode.value = subTreeMin;
               currentNode.right = deleteNode(currentNode.right,subTreeMin);
           }

       }
        return currentNode;

    }

    public void deleteNode(int value) {
       deleteNode(root,value);
    }

//    Min Value
    public int minValue(Node currentNode) {
       while (currentNode.left != null) {
           currentNode = currentNode.left;
       }
       return currentNode.value;
    }

//    BFS on Tree
    public ArrayList<Integer> BFS() {
       Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            result.add(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return result;

    }

//    Preorder DFS
    public ArrayList<Integer> DFSPreorder() {
       ArrayList<Integer> result = new ArrayList<>();
//       Create a new Class for Traverse
        class Traverse {
            Traverse(Node cuurentNode) {
                result.add(cuurentNode.value);

                if (cuurentNode.left != null) {
                    new Traverse(cuurentNode.left);
                }
                if (cuurentNode.right != null) {
                    new Traverse(cuurentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

//    Post Order DFS
    public ArrayList<Integer> DFSPostOrder() {
       ArrayList<Integer> result = new ArrayList<>();

       class Traverse {
           Traverse(Node currentNode) {
               if (currentNode.left != null) {
                   new Traverse(currentNode.left);
               }
               if (currentNode.right != null ) {
                   new Traverse(currentNode.right);
               }

               result.add(currentNode.value);
           }
       }
       new Traverse(root);
       return result;
    }

//    DFS In-Order
    public ArrayList<Integer> DFSInOrder() {
       ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                result.add(currentNode.value);
                if (currentNode.right != null ) {
                    new Traverse(currentNode.right);
                }


            }
        }
        new Traverse(root);
        return result;


    }




}
