package com.shildt.chapter1315.lambdaWithExceptions;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст.");
    }
}
