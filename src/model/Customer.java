package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer extends User{
     String address;
     Map<Integer, String> orderHistory;


     @Override
     public void getRole(){
          Order order = new Order();
          order.productList =  new ArrayList<>();
          order.productList.add("Laptop");
          order.productList.add("Smartphone");
          System.out.println("User: " + name + " registered  as a Customer");
          System.out.println("You added " + order.productList.getFirst() + " and " + order.productList.get(1) + " to the  cart" );
     }
}
