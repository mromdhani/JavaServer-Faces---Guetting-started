package be.businesstraining.service;

public class OrderBean {
	
    private String item;
    private Integer qty;
    private Double price;
 
    public OrderBean(String item, Integer qty, Double price) {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }   
 
    public String getItem() {
        return item;
    }
 
    public void setItem(String item) {
        this.item = item;
    }
 
    public Double getPrice() {
        return price;
    }
 
    public void setPrice(Double price) {
        this.price = price;
    }
 
    public Integer getQty() {
        return qty;
    }
 
    public void setQty(Integer qty) {
        this.qty = qty;
    }   
}