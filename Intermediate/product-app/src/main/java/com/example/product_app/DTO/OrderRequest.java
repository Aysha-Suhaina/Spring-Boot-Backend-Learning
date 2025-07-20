package com.example.product_app.DTO;

// import lombok.*;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
public class OrderRequest {
    private String product;
    private int quantity;
    private String method;
    private Double amount;


    public OrderRequest(){

    }
    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product= product;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public String getMethod(){
        return method;
    }
    public void setMethod(String method){
        this.method= method;
    }
    
    public double getAmount(){
        return amount;
    }
     public void setAmount(double amount){
        this.amount= amount;
    }
    @Override
public String toString() {
    return "OrderRequest{" +
            "product='" + product + '\'' +
            ", quantity=" + quantity +
            ", method='" + method + '\'' +
            ", amount=" + amount +
            '}';
}

}
