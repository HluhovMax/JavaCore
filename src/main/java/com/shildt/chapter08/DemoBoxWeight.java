package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume eqls: " + vol);
        System.out.println("Weight eqls: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume2 eqls: " + vol);
        System.out.println("Weight2 eqls: " + mybox2.weight);
        System.out.println();
    }
}
