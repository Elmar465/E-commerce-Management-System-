package model;

import java.util.List;
import java.util.Map;

public class Customer extends User{
     String address;
     Map<Integer, String> orderHistory;


     @Override
     public void getRole(){
          System.out.println("User: " + name + " registered  as a Customer");
     }
}
