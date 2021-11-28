package Lesson7;

public class Product {
    
    String nameProduct;
    double cost;
    int count;

    Product(String nameProduct, double cost) {
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    @Override
    public String toString() {
        String result = nameProduct + " в количестве " + count + ". Стоит "  + cost*count + " руб.";
        return (result);
    }
}