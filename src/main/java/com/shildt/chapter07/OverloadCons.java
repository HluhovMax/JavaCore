package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);

        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mycube.volume());
        System.out.println(myclone.volume());
    }
}
