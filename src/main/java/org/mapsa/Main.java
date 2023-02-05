package org.mapsa;

public class Main {
    try {
            ProductService productService = new ProductService(99) ;
        } catch (InvalidWeightException e) {
            System.out.println("Exception occured: " + e);
        }
    try {
            ProductService p1 = new ProductService(100);
        } catch (InvalidWeightException e){
            System.out.println("Exception occured: " + e);
        }
}
