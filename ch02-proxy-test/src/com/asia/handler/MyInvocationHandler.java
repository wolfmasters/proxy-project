package com.asia.handler;

import com.asia.factory.UKingSellFactroy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/5 2:43 下午
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理之前实现的一些增强");

        proxy.getClass().getInterfaces();

        Object object = method.invoke(target,args);

        if (object != null) {
            Float price = (Float) object + 25;
            object = price;
        }

        System.out.println("代理之后实现的一些增强");

        return object;
    }
}
