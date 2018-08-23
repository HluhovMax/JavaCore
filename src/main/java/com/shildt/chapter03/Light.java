package com.shildt.chapter03;

/**
 * Created by Max Hluhov on 23.08.2018.
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("For " + days);
        System.out.print(" days light go near ");
        System.out.println(distance + " miles.");
    }
}
