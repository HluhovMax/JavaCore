package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class Shipment extends BoxWeight {
    double cost;

    public Shipment(double width, double heigth, double depth, double weight, double cost) {
        super(width, heigth, depth, weight);
        this.cost = cost;
    }

    public Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }

    public Shipment(BoxWeight ob, double cost) {
        super(ob);
        this.cost = cost;
    }

    public Shipment(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "cost=" + cost +
                '}';
    }
}
