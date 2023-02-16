package task_01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDataProvider {
    private Queue<String> productsQueue;
    public QueueDataProvider(Queue<String> productsQueue) {
        this.productsQueue = productsQueue;
    }

    public Queue<String> createQueue() {

        productsQueue.add("Циановодород");
        productsQueue.add("Иприт");
        productsQueue.add("Фосген");
        productsQueue.add("Люизит");
        productsQueue.add("Зарин");

        return productsQueue;
    }
}
