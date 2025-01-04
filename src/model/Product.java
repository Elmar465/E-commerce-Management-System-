package model;

import java.util.List;

public class Product {

    private  Integer product_id;
    private String name;
    private List<Integer> price;
    private Integer stockQuantity;

    public Product(){

    }
    public Product(String name){
        this.name =  name;
    }

    //Getter
    public Integer getStockQuantity(){
        return stockQuantity;
    }

    //Setter
    public void setStockQuantity(Integer stockQuantity){
        this.stockQuantity = stockQuantity;
    }
    //Getter
    public Integer getProduct_id(){
        return product_id;
    }

    //Setter
    public void setProduct_id(Integer product_id){
        this.product_id = product_id;
    }

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String name){
        this.name =  name;
    }

    // Getter
        public List<Integer> getPrice(){
            return price;
        }

        //Setter
    public void setPrice(List<Integer> price){
        this.price = price;
    }

    @Override
    public String toString(){
        return name;
    }
//    public void checkPrice(){
//        if(getPrice()) {
//            System.out.println("Price cannot be minus try again ");
//        }
//    }

    public  void isAvailable() {
        if (getName() != null && !getName().isEmpty()) {
            System.out.println(getName() + " is available ");
        } else {
            System.out.println("Product is not available Sorry...");
        }
    }
}
