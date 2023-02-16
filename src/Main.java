
import task_01.ProductsQueue;
import task_01.QueueDataProvider;
import task_02.ProductsQueueExtendedVersion;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("Задание 1");
        ProductsQueue productsQueue = new ProductsQueue(new QueueDataProvider(new LinkedList<>()).createQueue());

        System.out.println("Перечень создан!\n");
        productsQueue.showProductQueue();

        System.out.print(productsQueue.addProduct());
        System.out.print(productsQueue.showProductQueue());

//task 2
        System.out.println("\nЗадание 2");
        ProductsQueueExtendedVersion productsQueueExtendedVersion = new ProductsQueueExtendedVersion(new QueueDataProvider(new LinkedList<>()).createQueue());

        System.out.println("Перечень создан!\n");
        productsQueueExtendedVersion.showProductQueue();

        System.out.print(productsQueueExtendedVersion.deleteProduct());
        System.out.print(productsQueueExtendedVersion.showProductQueue());

    }
}