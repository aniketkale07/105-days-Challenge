// Queue is interface s, we cant direclty instimate the Queue

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {

        // implementation of Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // implementation of Queue using PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // implementation of Queue using ArrayDequeu
        Queue<Integer> arrayDeque = new ArrayDeque<>();

        // adding in queue
        queue.add(4);
        queue.add(41);
        queue.add(42);
        queue.add(44);
        queue.add(64);
        queue.add(74);

        // Display the element
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            String result = queue.toString();
            System.out.println(result);
        }
        // display element
        int firstElement = queue.peek();
        System.out.println("First element in Queue --> " + firstElement);

        // removeing first element
        boolean isDelete=queue.remove(2);
        if(isDelete){
            System.out.println("Element is deleted...");
            System.out.println(queue.toString());
        }
    }
}
