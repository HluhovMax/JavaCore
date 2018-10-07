package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class InstanceMethWithObjectRefDemo {

    static <T> int counter(T[] vals, MyFunctionIface<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i],v)) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int count;

        HighTemp[] weekDaysHighs = {new HighTemp(89), new HighTemp(91),
                new HighTemp(92), new HighTemp(88),
                new HighTemp(87), new HighTemp(90),
                new HighTemp(89), new HighTemp(85),};
        count = counter(weekDaysHighs, HighTemp::sameTemp, new HighTemp(89));

        System.out.println("дней, когда максимальная температура была 89: " + count);
    }
}
