package org.example;

public class ProductService {
    private int weight ;
    public ProductService(int weight)throws InvalidWeightException{
        if(weight <100){
            throw new InvalidWeightException("Invalid product exception") ;
        }
        else {
            this.weight = weight ;
            System.out.println("weight is valid!");
        }
    }
}
