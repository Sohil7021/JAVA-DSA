package queue.Exercise;

public class main {
    public static void main(String[] args) {
        Queue_E myQueue = new Queue_E(1);

//        Enqueue
        myQueue.enqueue(2);

//        Dequeue
        myQueue.dequeue();


        myQueue.printQueue();
    }
}
