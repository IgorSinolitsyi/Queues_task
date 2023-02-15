package task_02;

import task_01.ProductsQueue;

public class ProductsQueueExtendedVersion extends ProductsQueue {

    public ProductsQueueExtendedVersion() {
        super();
    }

    public String deleteProduct() {

        super.productsQueue.remove();
        return "\nУдалил из начала перечня один элемент!\n";
    }

}
