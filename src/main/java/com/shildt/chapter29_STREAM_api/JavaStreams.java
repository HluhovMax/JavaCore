package com.shildt.chapter29_STREAM_api;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaStreams{
	public static void main(String[]args) throws IOException{
		IntStream.
				range(1, 10).
				forEach(System.out::print);
        System.out.println();

        Arrays.stream(new int[]{2,4,6,8,10})
                .map(x->x*x)
                .average()
                .ifPresent(System.out::println);
    }
}