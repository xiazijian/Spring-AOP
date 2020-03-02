package com.imooc.pattern;

/**
 * Created by xwy on 2020-03-01.、.
 */
public class Client {

    public static void main(String[] args){
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
