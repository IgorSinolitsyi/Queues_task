package data_source;

import java.util.Queue;

public class QueueDataSource {
    private Queue<String> productsQueue;
    public QueueDataSource(Queue<String> productsQueue) {
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
