package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static model.Admin.updateProduct;

public class Store {
    List<String> productList;
    List<String> users;


    //Default
    public Store(){
    }

    //Parametized const
    public Store(List<String> productList){
        this.productList = productList;
    }


   static Scanner scanner =  new Scanner(System.in);
    public void addProduct() {
        Product product = new Product();
        System.out.println("Registering the products...");
        productList =  new ArrayList<>();
        productList.add("Laptop");
        productList.add("Smartphone");
        product.setPrice(Arrays.asList(1200,800));
        for(int i = 1; i < productList.stream().count(); i++){
            System.out.println("Product: " + productList.getFirst() + " with price "  + " $" + product.getPrice().getFirst() + " added to the store");
            System.out.println("Product: " + productList.get(1) + " with price "  + " $" + product.getPrice().get(1) + " added to the store");
        }
    }

    public void deleteProduct(){
        Scanner scanner =  new Scanner(System.in);
        try {
            List<Product> products = new ArrayList<>();
            products.add(new Product("Iphone"));
            products.add(new Product("MacBook"));
            products.add(new Product("Sofa"));
            System.out.println("You Product List");
            for (Product product : products) {
                System.out.println("- " + product);
            }

            System.out.print("Which Product You want to Delete: ");
            String deleteProduct = scanner.nextLine();
            products.removeIf(product -> product.getName().equalsIgnoreCase(deleteProduct));

            System.out.println("Updated Product List:");
            for (Product product : products) {
                System.out.println("- " + product);
            }
        } catch (Exception e) {
            System.out.println("Unkown Error");
        }
    }
    public void registerUser(){
         Customer cusotmer =  new Customer();
         Admin admin =  new Admin();
         Order order =  new Order();
         Cart cart=  new Cart();
         System.out.print("Enter name:");
         cusotmer.name =  scanner.nextLine();
         System.out.println("Are you registering as a Customer ?");
         String choice =  scanner.nextLine();
         if(choice.equals("yes")){
             cusotmer.getRole();
             order.calculateTotalAmount();
             System.out.print("You want to checkout:");
             choice  = scanner.nextLine();
             if(choice.equals("yes")){
                cart.checkOut();
             } else  {
                 addProduct();
             }
         } else if (choice.equals("no")){
             admin.name = cusotmer.name;
             admin.getRole();
             System.out.println("Which operation do you want to do ?");
             System.out.println("1.Add Product");
             System.out.println("2.Remove Product");
             System.out.println("3.Update Product");
             System.out.println("4.Exit");
             int option = scanner.nextInt();
             switch (option){
                 case 1:
                     addProduct();
                     break;
                 case 2:
                     deleteProduct();
                     break;
                 case 3:
                     updateProduct();
                    break;
                 case 4:
                     System.exit(0);
                 default:
                     System.out.println("Sorry wrong input try again");
                     registerUser();
             }
         }

    }
}
