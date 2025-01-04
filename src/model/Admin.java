package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Admin extends User{


    public Admin(String name) {
        super(name);
        this.name = name;
    }
    public Admin(){
        super();

    }

    @Override
    public  void getRole() {
        System.out.println("User: " + this.name + " registered as an Admin.");
    }
    public void addProduct(){
        Product product1 = new Product();
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the product name: ");
        product1.setName(scanner.nextLine());
        System.out.println(product1.getName() + " added to the inventory");
    }


    public static void deleteProduct(){
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

    public static void updateProduct(){
        Product product =  new Product();
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the product name which you want to update");
        product.setName(scanner.nextLine());
        if(product.getName() != null && !product.getName().isEmpty()){
            System.out.println("What name  you want to change this product " + product.getName());
            product.setName(scanner.nextLine());
            System.out.println(product.getName() + " is updated");
        }
    }

}
