package model;

import java.util.ArrayList;
import java.util.List;

public class Cart extends  Order {


    public Cart(){

    }
    public Cart(List<String> productList, List<Integer> totalAmount){
        super(productList, totalAmount);
        this.productList = productList;
        this.totalAmount = totalAmount;
    }
    public void checkOut(){
        Product product = new Product();
        product.setStockQuantity(9);
        productList =  new ArrayList<>();
        totalAmount =  new ArrayList<>();
        productList.add("Laptop");
        productList.add("Smartphone");
        totalAmount.add(1200);
        totalAmount.add(800);
        System.out.println("Current available products");
        System.out.println("1." +productList.getFirst() + "- " + " $" + totalAmount.getFirst() + " (Stock: " + product.getStockQuantity() + ")");
        System.out.println("1." +productList.get(1) + "- " + " $" + totalAmount.get(1) + " (Stock: " + product.getStockQuantity() + ")");
    }
}
