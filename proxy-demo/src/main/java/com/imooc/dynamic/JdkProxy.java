package com.imooc.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * aspect
 * Created by xwy on 2020-03-01.
 */
public class JdkProxy implements InvocationHandler{

    //private RealSubject realSubject;
    private Object object;

    public JdkProxy(Object object) {
        //this.realSubject = realSubject;
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = null;
        try{
            //result = method.invoke(realSubject,args);
            result = method.invoke(this.object,args);
        }catch (Exception e){
            System.out.println("ex:"+e.getMessage());
            throw e;
        }finally {
            System.out.println("after");
        }
        return result;
    }
}
