package com.imooc.dynamic;

import com.imooc.pattern.RealSubject;
import com.imooc.pattern.Subject;

import java.lang.reflect.Proxy;

/**
 * System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
 * Created by cat on 2017-02-27.
 */
public class Client {

    public static void main(String[] args){
        //下面一行代码可以保存动态生成的代理类代码~~
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //第一个参数是传ClassLoader，所以只要传的ClassLoader与接口的ClassLoader一样就行，因为接口的ClassLoader是System ClassLoader所以第一个参数可以写成 代码中的类.class.getClassLoader() 即可
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkProxy(new RealSubject()));
        subject.hello();
    }
}
