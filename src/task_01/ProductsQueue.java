package task_01;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductsQueue {
    protected Queue<String> productsQueue;

    public ProductsQueue(Queue<String> productsQueue) {
        this.productsQueue = productsQueue;
    }

    public String addProduct() {

        productsQueue.add("Табун");
        return "\nДобавлно к перечню еще одно наименование товара!\n";
    }

    public String showProductQueue() {

        AtomicInteger i = new AtomicInteger(0);

        if (productsQueue.isEmpty()) return "\nПеречень пуст!";
        for (String product : productsQueue) {
            System.out.println(i.incrementAndGet() + ". " + product);
        }
        return "\nВыведен нумерованый перечень!\n";
    }
}
