package com.shildt.game;

import java.util.Scanner;

/**
 * Created by Max Hluhov on 30.08.2018.
 */
public class GameLogic {
    private char x = 'X';
    private char o = 'O';
    Field field;
    private String text = " , please, chose your next position";
    private String ai = "Artificial Intelligence";
    private String m = " move: ";
    private String human = "Human";
    private String yoda = "Yoda";
    public void start() {
        field = new Field();
        System.out.println("Welcome to the Star Wars Tic-Tac-Toe game!");
        System.out.println(ai + ": " + "Today, I will definitely win! hahaha");
        System.out.println(human + ": " + "let's see, a piece of iron");
        System.out.println("***" + human + text + "***");
        field.showField();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                field.c[0] = x;
                System.out.println(human + m);
                field.showField();
                field.c[2] = o;
                System.out.println(ai + m);
                field.showField();
                System.out.println(human + text + " from 4-6***");
                int i1 = scanner.nextInt();
                switch (i1) {
                    case 4:
                        field.c[3] = x;
                        field.showField();
                        System.out.println(human + m);
                        field.c[6] = o;
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println("If you want to win, maybe, you should enter 5!");
                        int i2 = scanner.nextInt();
                        if (i2 == 5) {
                            field.c[4] = x;
                            System.out.println("You are so clever man!");
                            field.showField();
                            System.out.println("***************");
                            System.out.println(ai + m);
                            field.c[8] = o;
                            field.showField();
                            System.out.println("***************");
                            field.c[5] = x;
                            field.c[3] = field.c[4] = field.c[5] = '-';
                            field.showField();
                            System.out.println(human + " today Dark Forces on your side!");
                        } else {
                            field.c[4] = o;
                            System.out.println(human + " you are a Big Big looser:((");
                            field.c[2] = field.c[4] = field.c[6] = '/';
                            field.showField();
                            System.out.println(ai + " Good job!");
                        }
                        break;
                    case 5:
                        field.c[4] = x;
                        System.out.println(human + m);
                        field.showField();
                        field.c[8] = o;
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println("If you want to win, maybe, you should enter 6!");
                        int i3 = scanner.nextInt();
                        if (i3 == 6) {
                            field.c[5] = x;
                            field.showField();
                            System.out.println("***************");
                            field.c[3] = o;
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(human + " you have one unread message from: " + ai);
                            System.out.println("If " + human + " want to read enter '1'.");
                            int answer = scanner.nextInt();
                            switch (answer) {
                                case 1:
                                    System.out.println(human + " hello, it is " + ai + " we have some system error... ");
                                    System.out.println("Look, if you wanna win, tap 2");
                                    System.out.println("Addio");
                                    break;
                            }
                            System.out.println(yoda + ": look, " + human + " it is only your chose, who wins today the power of Light or Darkness!");
                            System.out.println("So, " + human + ", your move: ");
                            Scanner scan = scanner;
                            int i4 = scan.nextInt();
                            switch (i4) {
                                case 2:
                                    field.c[1] = x;
                                    System.out.println(human + m);
                                    field.showField();
                                    field.c[6] = o;
                                    System.out.println(ai + m);
                                    System.out.println("404-BigProblemError");
                                    field.showField();
                                    field.c[7] = x;
                                    System.out.println(human + m);
                                    field.showField();
                                    System.out.println("***************");
                                    field.c[1] = field.c[4] = field.c[7] = '|';
                                    field.showField();
                                    System.out.println(yoda + ": congratulations " + human + " today the forces of Light won!!!");
                            }
                        }
                        break;
                    case 6:
                        field.c[5] = x;
                        System.out.println(human + m);
                        field.showField();
                        field.c[6] = o;
                        System.out.println(ai + ": aha... Let's think...");
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(ai + ": your move Fresh Meat");
                        System.out.println(yoda + ": be careful, he's very insolent");
                        System.out.println(human + ": with power of light-sword I'll do that!");
                        System.out.println(human + text + " it must be 5!!!");
                        int i4 = scanner.nextInt();
                        if (i4 == 5) {
                            field.c[4] = x;
                            System.out.println(human + m);
                            field.showField();
                        } else {
                            System.out.println(ai + ": in that case I'll win!!!");
                        }
                        field.c[3] = o;
                        System.out.println(ai + ": ahaa, game over for, you'll never win!!!");
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + ": haha!");
                        System.out.println(human + ": the game will end when i want ");
                        System.out.println("To win, please, enter 9");
                        int i5 = scanner.nextInt();
                        if (i5 == 9) {
                            field.c[8] = x;
                            System.out.println(human + m);
                            field.showField();
                            System.out.println("***************");
                            field.c[0] = field.c[4] = field.c[8] = '*';
                            field.showField();
                            System.out.println(yoda + ": Congratulations " + human + " victory, today, is our!!!");
                        }
                        break;
                }
                break;
            case 2:

        }
    }
}
