package com.foodies_fave_queue_management;

public class FoodQueue {
    private Customer customer_;
    private int price;
    private int queue;
    private int No_ofBurgers_required;

    public FoodQueue(Customer customer_, int price, int queue, int no_ofBurgers_required) {
        this.customer_ = customer_;
        this.price = price;
        this.queue = queue;
        No_ofBurgers_required = no_ofBurgers_required;
    }

    public Customer getCustomer_() {
        return customer_;
    }

    public int getPrice() {
        return price;
    }

    public int getQueue() {
        return queue;
    }
    public int getNo_ofBurgers_required() {
        return No_ofBurgers_required;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

