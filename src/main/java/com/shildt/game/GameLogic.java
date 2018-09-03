package com.shildt.game;

import java.util.Scanner;

/**
 * Created by Max Hluhov on 30.08.2018.
 */
public class GameLogic {
    private char x = 'X';// variable for Human-player
    private char o = 'O';// variable for Artificial Intelligence
    Field field;
    private String text = " , please, chose your next position";// some staff variables for fun))
    private String ai = "Artificial Intelligence";
    private String m = " move: ";
    private String human = "Human";
    private String yoda = "Yoda";
    public void start() {// Game logic method
        field = new Field();
        System.out.println("Welcome to the Star Wars Tic-Tac-Toe game!");
        System.out.println(ai + ": " + "Today, I will definitely win! hahaha");
        System.out.println(human + ": " + "let's see, a piece of iron");
        System.out.println("***" + human + text + "***");
        field.showField();
        System.out.println();
        nextStep();
    }

    public void nextStep() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                field.setSymbolByIndex(0, x);
                System.out.println(human + m);
                field.showField();
                field.setSymbolByIndex(2, o);
                System.out.println(ai + m);
                field.showField();
                System.out.println(human + text + " from 4-6***");
                int i1 = scanner.nextInt();
                switch (i1) {
                    case 4:
                        field.setSymbolByIndex(3, x);
                        field.showField();
                        System.out.println(human + m);
                        field.setSymbolByIndex(6, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println("If you want to win, maybe, you should enter 5!");
                        int i2 = scanner.nextInt();
                        if (i2 == 5) {
                            field.setSymbolByIndex(4, x);
                            System.out.println("You are so clever man!");
                            field.showField();
                            System.out.println("***************");
                            System.out.println(ai + m);
                            field.setSymbolByIndex(8, o);
                            field.showField();
                            System.out.println("***************");
                            field.setSymbolByIndex(5, x);
                            field.setSymbolByIndex(3, 4, 5, '-');
                            field.showField();
                            System.out.println(human + " today Dark Forces on your side!");
                        } else {
                            field.setSymbolByIndex(4, o);
                            System.out.println(human + " you are a Big Big looser:((");
                            field.setSymbolByIndex(2, 4, 6, '/');
                            field.showField();
                            System.out.println(ai + " Good job!");
                        }
                        break;
                    case 5:
                        field.setSymbolByIndex(4, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(8, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println("If you want to win, maybe, you should enter 6!");
                        int i3 = scanner.nextInt();
                        if (i3 == 6) {
                            field.setSymbolByIndex(5, x);
                            field.showField();
                            System.out.println("***************");
                            field.setSymbolByIndex(3, o);
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
                                    field.setSymbolByIndex(1, x);
                                    System.out.println(human + m);
                                    field.showField();
                                    field.setSymbolByIndex(6, o);
                                    System.out.println(ai + m);
                                    System.out.println("404-BigProblemError");
                                    field.showField();
                                    field.setSymbolByIndex(7, x);
                                    System.out.println(human + m);
                                    field.showField();
                                    System.out.println("***************");
                                    field.setSymbolByIndex(1, 4, 7, '|');
                                    field.showField();
                                    System.out.println(yoda + ": congratulations " + human + " today the forces of Light won!!!");
                            }
                        }
                        break;
                    case 6:
                        field.setSymbolByIndex(5, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(6, o);
                        System.out.println(ai + ": aha... Let's think...");
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(ai + ": your move Fresh Meat");
                        System.out.println(yoda + ": be careful, he's very insolent");
                        System.out.println(human + ": with power of light-sword I'll do that!");
                        System.out.println(human + text + " it must be 5!!!");
                        int i4 = scanner.nextInt();
                        if (i4 == 5) {
                            field.setSymbolByIndex(4, x);
                            System.out.println(human + m);
                            field.showField();
                        } else {
                            System.out.println(ai + ": in that case I'll win!!!");
                        }
                        field.setSymbolByIndex(3, o);
                        System.out.println(ai + ": ahaa, game over , you'll never win!!!");
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + ": haha!");
                        System.out.println(human + ": the game will end when i want ");
                        System.out.println("To win, please, enter 9");
                        int i5 = scanner.nextInt();
                        if (i5 == 9) {
                            field.setSymbolByIndex(8, x);
                            System.out.println(human + m);
                            field.showField();
                            System.out.println("***************");
                            field.setSymbolByIndex(0, 4, 8, '*');
                            field.showField();
                            System.out.println(yoda + ": Congratulations " + human + " victory, today, is our!!!");
                        }
                        break;
                }
                break;
            case 2:
                field.setSymbolByIndex(1, x);
                System.out.println(human + m);
                field.showField();
                field.setSymbolByIndex(7, o);
                System.out.println(ai + m);
                field.showField();
                System.out.println(human + text + " from 4-6***");
                System.out.println("So your " + m + " " + human);
                int i2 = scanner.nextInt();
                switch (i2) {
                    case 4:
                        field.setSymbolByIndex(3, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(8, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + " chose your next position: ");
                        int i3 = scanner.nextInt();
                        if (i3 == 7) {
                            field.setSymbolByIndex(6, x);
                            System.out.println(human + m);
                            field.showField();
                            field.setSymbolByIndex(4, o);
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(human + " chose your next position: ");
                            int i4 = scanner.nextInt();
                            if (i4 == 1) {
                                field.setSymbolByIndex(0, x);
                                System.out.println(human + m);
                                field.showField();
                                System.out.println("***************");
                                field.setSymbolByIndex(0, 3, 6, '|');
                                field.showField();
                                System.out.println(human + " winner!!!");
                            } else {
                                field.setSymbolByIndex(0, o);
                                System.out.println(ai + ": in that case I'll win!!!");
                                field.showField();
                                System.out.println("***************");
                                field.setSymbolByIndex(0, 4, 8, '*');
                                field.showField();
                                System.out.println(ai + " winner!!!");
                            }
                        } else {
                            field.setSymbolByIndex(6, o);
                            System.out.println(ai + ": in that case I'll win!");
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(ai + " winner today!!!");
                        }
                        break;
                    case 5:
                        field.setSymbolByIndex(4, x);
                        field.setSymbolByIndex(8, o);
                        field.showField();
                        System.out.println(human + " chose your next position: ");
                        int i4 = scanner.nextInt();
                        if (i4 == 7) {
                            field.setSymbolByIndex(6, x);
                            System.out.println(human + m);
                            field.showField();
                            field.setSymbolByIndex(5, o);
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(human + " chose your next position: ");
                            int i5 = scanner.nextInt();
                            if (i5 == 3) {
                                field.setSymbolByIndex(2, x);
                                System.out.println(human + m);
                                field.showField();
                                System.out.println("***************");
                                field.setSymbolByIndex(2, 4, 6, '/');
                                field.showField();
                                System.out.println(human + " winner!!!");
                            } else {
                                field.setSymbolByIndex(2, o);
                                System.out.println(ai + ": in that case I'll win!!!");
                                System.out.println(ai + m);
                                field.showField();
                                System.out.println(ai + " winner!!!");
                            }
                        } else {
                            field.setSymbolByIndex(6, o);
                            System.out.println(ai + ": in that case I'll win!!!");
                            System.out.println(ai + m);
                            field.showField();
                        }
                        break;
                    case 6:
                        field.setSymbolByIndex(5, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(6, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + " chose your next position: ");
                        int i5 = scanner.nextInt();
                        if (i5 == 9) {
                            field.setSymbolByIndex(8, x);
                            System.out.println(human + m);
                            field.showField();
                            field.setSymbolByIndex(4, o);
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(human + " chose your next position: ");
                            int i6 = scanner.nextInt();
                            if (i6 == 3) {
                                field.setSymbolByIndex(2, x);
                                System.out.println(human + m);
                                field.showField();
                                System.out.println(human + " winner!!!");
                            } else {
                                field.setSymbolByIndex(2, o);
                                System.out.println(ai + ": in that case I'll win!!!");
                                System.out.println(ai + m);
                                field.showField();
                                System.out.println(ai + " winner!!!");
                            }
                        } else {
                            field.setSymbolByIndex(8, o);
                            System.out.println(ai + ": in that case I'll win!!!");
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(ai + " winner!!!");
                        }
                        break;
                    default:
                        System.out.println("Please, enter value from 1-3.");
                        break;
                }
                break;
            case 3:
                field.setSymbolByIndex(2, x);
                System.out.println(human + m);
                field.showField();
                field.setSymbolByIndex(5, o);
                System.out.println(ai + m);
                field.showField();
                System.out.println(human + " chose your next position: ");
                int i3 = scanner.nextInt();
                switch (i3) {
                    case 1:
                        field.setSymbolByIndex(0, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(1, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + " chose your next position: ");
                        int i4 = scanner.nextInt();
                        if (i4 == 5) {
                            field.setSymbolByIndex(4, x);
                            System.out.println(human + m);
                            field.showField();
                            field.setSymbolByIndex(6, o);
                            System.out.println(ai + m);
                            field.showField();
                            int i5 = scanner.nextInt();
                            if (i5 == 9) {
                                field.setSymbolByIndex(8, x);
                                System.out.println(human + m);
                                field.showField();
                                System.out.println(human + " winner!!!");
                            } else {
                                field.setSymbolByIndex(8, o);
                                System.out.println(ai + m);
                                field.showField();
                                System.out.println(ai + ": draw!!!");// draw==friendship
                            }
                        } else {
                            System.out.println("It is very bad idea!");
                        }
                        break;
                    case 2:
                        field.setSymbolByIndex(1, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(0, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + " chose your next position: ");
                        int i5 = scanner.nextInt();
                        if (i5 == 5) {
                            field.setSymbolByIndex(4, x);
                            System.out.println(human + m);
                            field.showField();
                            field.setSymbolByIndex(7, o);
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(human + " chose your next position: ");
                            int i6 = scanner.nextInt();
                            if (i6 == 7) {
                                field.setSymbolByIndex(6, x);
                                System.out.println(human + m);
                                field.showField();
                                System.out.println(human + " winner!!!");
                            } else {
                                System.out.println(ai + ": draw!!!");
                            }
                        } else {
                            System.out.println(ai + ": draw!!!");
                        }
                        break;
                    case 5:
                        field.setSymbolByIndex(4, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(6, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + " chose your next position: ");
                        System.out.println("For sure, it should be '1'");
                        int i6 = scanner.nextInt();
                        if (i6 == 1) {
                            field.setSymbolByIndex(0, x);
                            System.out.println(human + m);
                            field.showField();
                            field.setSymbolByIndex(1, o);
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(human + " chose your next position: ");
                            int i7 = scanner.nextInt();
                            if (i7 == 9) {
                                field.setSymbolByIndex(8, x);
                                System.out.println(human + m);
                                field.showField();
                                System.out.println(human + " winner!!!");
                            } else {
                                System.out.println("Don't be so stupid!!!");
                            }
                        } else {
                            System.out.println(ai + ": draw!!!");
                        }
                        break;
                    case 7:
                        field.setSymbolByIndex(6, x);
                        System.out.println(human + m);
                        field.showField();
                        field.setSymbolByIndex(4, o);
                        System.out.println(ai + m);
                        field.showField();
                        System.out.println(human + " chose your next position: ");
                        int i7 = scanner.nextInt();
                        if (i7 == 1) {
                            field.setSymbolByIndex(0, x);
                            System.out.println(human + m);
                            field.setSymbolByIndex(3, o);
                            System.out.println(ai + m);
                            field.showField();
                            System.out.println(ai + " winner!!!");
                        } else {
                            System.out.println(ai + ": draw!!!");
                        }
                        break;
                    default:
                        System.out.println("Please, chose another position!");
                        break;
                }
            default:
                System.out.println("|***************|");
                System.out.println("Please start game again and enter value from 1-3.");
                break;
        }
    }

    void checkWin(Field f) {
        if (((f.c[0] == 'X') && (f.c[1] == 'X') && (f.c[2] == 'X'))
                || ((f.c[3] == 'X') && (f.c[4] == 'X') && (f.c[5] == 'X'))
                || ((f.c[6] == 'X') && (f.c[7] == 'X') && (f.c[8] == 'X'))
                || ((f.c[0] == 'X') && (f.c[3] == 'X') && (f.c[6] == 'X'))
                || ((f.c[1] == 'X') && (f.c[4] == 'X') && (f.c[7] == 'X'))
                || ((f.c[2] == 'X') && (f.c[5] == 'X') && (f.c[8] == 'X'))
                || ((f.c[0] == 'X') && (f.c[4] == 'X') && (f.c[8] == 'X'))
                || ((f.c[2] == 'X') && (f.c[4] == 'X') && (f.c[6] == 'X'))) {
            System.out.println(human + " winner!!!");
        } else {
            System.out.println(ai + " winner!!!");
        }
    }
}
