package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        System.out.println(shipment1.volume());
        System.out.println(shipment1.cost);

        System.out.println(shipment2.volume());
        System.out.println(shipment2.cost);
    }
}
