package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double width, double heigth, double depth, double weight) {
        super(width, heigth, depth);
        this.weight = weight;
    }

    public BoxWeight() {
        super();
        weight = -1;
    }

    public BoxWeight(BoxWeight ob) {
        super(ob);
        weight = -1;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BoxWeight{" +
                "weight=" + weight +
                '}';
    }
}
