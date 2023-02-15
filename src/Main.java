

import task_01.ProductsQueue;
import task_02.ProductsQueueExtendedVersion;

public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("Задание 1");
        ProductsQueue productsQueue = new ProductsQueue();

        System.out.print(productsQueue.createQueue());
        productsQueue.showProductQueue();

        System.out.print(productsQueue.addProduct());
        System.out.print(productsQueue.showProductQueue());

//task 2
        System.out.println("\nЗадание 2");
        ProductsQueueExtendedVersion productsQueueExtendedVersion = new ProductsQueueExtendedVersion();

        System.out.print(productsQueueExtendedVersion.createQueue());
        productsQueueExtendedVersion.showProductQueue();

        System.out.print(productsQueueExtendedVersion.deleteProduct());
        System.out.print(productsQueueExtendedVersion.showProductQueue());

    }
}