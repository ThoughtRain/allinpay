package com.allinpaly.service;

/**
 * Created by prarui on 2017/8/7.
 */
public class Main {

    public static void main(String arg[]) {
        String x[] = {"a", "b", "c"};
        for (int index = 0; index < x.length; index++) {
            for (int i = 0; i < x.length; i++) {
                {
                    System.out.println(x[index] + x[i]);
                }
            }
        }
    }
}
