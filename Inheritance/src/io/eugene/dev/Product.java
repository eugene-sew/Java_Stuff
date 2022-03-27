package io.eugene.dev;

public class Product {


        //attributes
        private   int pid;
        private   String name;
        private   int price;

        //methods
//    add data to product object
        void setProductDetail(int pid,String name,int price){
            this.pid = pid;
            this.name = name;
            this.price = price;
        }

        //    show product details
        void showProductDetails(){
            System.out.println("________Product ID: "+pid+"_______");
            System.out.println("Product Name:\t"+name);
            System.out.println("Product Price:\t"+price);
            System.out.println("-------------------------------------------");

        }
        //constructor
        Product(){
            System.out.println(">> Product object constructed <<");
        }

}
