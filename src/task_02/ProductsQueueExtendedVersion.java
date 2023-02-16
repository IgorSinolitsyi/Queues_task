package task_02;

import task_01.ProductsQueue;

import java.util.Queue;

public class ProductsQueueExtendedVersion extends ProductsQueue {
    public ProductsQueueExtendedVersion(Queue<String> productsQueue) {
        super(productsQueue);
    }

    public String deleteProduct() {

        productsQueue.poll();
        return "\nУдалил из начала перечня один элемент!\n";
    }

}
