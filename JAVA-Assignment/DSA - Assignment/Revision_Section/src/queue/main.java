package queue;

public class main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(3);
        myQueue.enqueue(4);
        myQueue.dequeue();

        myQueue.printQueue();
    }
}
