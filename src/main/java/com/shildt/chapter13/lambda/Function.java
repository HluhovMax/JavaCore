package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public interface Function<T> {
    int func(T[] vals, T v);
}