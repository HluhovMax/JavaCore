package com.shildt.exceptions;

/**
 * Created by Max Hluhov on 02.10.2018.
 */
public class Finally2Demo {
    static void procA() {
        try {
            System.out.println("procA()");
            throw new RuntimeException();
        } finally{
            System.out.println("finally in procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("procB()");
            return;
        }finally {
            System.out.println("finally in procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("procC()");
        }finally {
            System.out.println("finally in procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception catches");
        }
        procB();
        procC();
    }

}
