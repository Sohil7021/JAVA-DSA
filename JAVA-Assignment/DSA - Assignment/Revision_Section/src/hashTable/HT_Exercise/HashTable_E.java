package hashTable.HT_Exercise;

import java.util.ArrayList;

public class HashTable_E {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable_E() {
        dataMap = new Node[size];
    }

//    Hash Method
    public int hash(String key) {
        int hash = 0;
        char[] keyChar = key.toCharArray();
        for (int i = 0; i < keyChar.length; i++) {
            int asciiValue = keyChar[i];
            hash = (hash + asciiValue * 23) % dataMap.length;

        }
        return hash;
    }

//    set
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key,value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        }else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

//    Get
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

//    Key ArrayList
    public ArrayList key() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length ; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }


//    Print Hash Table
    public void printHashTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }

        }
    }

}
