package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Order {



    String orderId;
   List<String> productList;
    List<Integer> totalAmount;
    static Scanner scanner = new Scanner(System.in);


    public Order(){
    }

    public Order(List<String> productList, List<Integer> totalAmount){
        this.productList = productList;
        this.totalAmount = totalAmount;
    }

    public void calculateTotalAmount(){
        System.out.print("Enter the name of Customer:");
        String name =  scanner.nextLine();
        if(!(name == null) && !name.isEmpty()){
           orderId = "001";
           productList = new ArrayList<>();
           totalAmount = new ArrayList<>();
           productList.add("Laptop");
           productList.add("Smartphone");
           totalAmount.add(2000);
            System.out.println("Order history of " + name) ;
            System.out.println("Order Id:" + orderId);
            System.out.println("Products: " + productList.getFirst() + ", "  + productList.get(1));
            System.out.println("Total Amount: " + "$" + totalAmount.getFirst());
        }
    }
}
