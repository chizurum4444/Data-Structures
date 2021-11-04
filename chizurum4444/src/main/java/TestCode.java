import divideAndConquer.MaxDC;
import hashing.*;
import queue.LinkedListQueue;


public class TestCode {
    public static void main(String[] args) {
        // hashing
        /*
        ChainingHashTable table = new ChainingHashTable(13);

        table.put("100426001", new Student("100426001", "First", "Student", 0.5f));
        table.put("100809002", new Student("100809002", "Second", "Student", 1.0f));
        table.put("100113004", new Student("100113003", "Third", "Student", 1.5f));
        table.put("100725003", new Student("100725004", "Fourth", "Student", 2.0f));
        table.put("100603005", new Student("100603005", "Fifth", "Student", 2.5f));
        table.put("100399006", new Student("100426006", "Sixth", "Student", 3.0f));

        table.print();
        System.out.println("");
        */

        // divide and conquer

        int[] list1 = {1,-1,6,3,-4,14,-20};
        System.out.println("maxDivideAndConquer({1,-1,6,3,-4,14,-20}): " + MaxDC.maxDivideAndConquer(list1));
        // 14
        int[] list2 = {-32,6,11,-17,2,-12,30,-8,27};
        System.out.println("maxDivideAndConquer({-32,6,11,-17,2,-12,30,-8,27}): " + MaxDC.maxDivideAndConquer(list2));
        // 30    

        System.out.println("");

        /*
        // queue

        LinkedListQueue<String> queue = new LinkedListQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");

        System.out.printf("Size: %d\n", queue.size());

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        */
    }
         
}
