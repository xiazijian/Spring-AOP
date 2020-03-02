package com.imooc.pattern;

/**
 * Created by xwy on 2020-03-01.
 */
public  class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject execute request");
    }

    @Override
    public void hello() {
        System.out.println("real subject hello");
    }
    public static void hehe(){
        System.out.println("real he");
    }
}
