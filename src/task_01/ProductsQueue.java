package task_01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductsQueue {
    protected Queue<String> productsQueue = new LinkedList<>();

    public ProductsQueue() {
    }

    public String createQueue() {

        productsQueue.add("Циановодород");
        productsQueue.add("Иприт");
        productsQueue.add("Фосген");
        productsQueue.add("Люизит");
        productsQueue.add("Зарин");

        return "\nПеречень товаров из 5-и наименований создан!\n";
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
