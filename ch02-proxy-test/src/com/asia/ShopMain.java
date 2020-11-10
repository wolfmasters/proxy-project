package com.asia;


import com.asia.factory.UKingSellFactroy;
import com.asia.handler.MyInvocationHandler;
import com.asia.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/5 3:14 下午
 */
public class ShopMain {
    public static void main(String[] args) {
        //ClassLoader loader,:目标对象的类加载器
        //Class<?>[] interfaces,
        //InvocationHandler h
        UsbSell usbSell = new UKingSellFactroy();
//
//        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(usbSell);
//        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(usbSell.getClass().getClassLoader(), usbSell.getClass().getInterfaces(),myInvocationHandler);
//
//        float price = proxy.sell(10);
//        System.out.println("通过动态代理返回的price：" + price);


        //匿名内部类实现动态代理
        UsbSell proxy1 = (UsbSell) Proxy.newProxyInstance(UsbSell.class.getClassLoader(), usbSell.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //执行一些增强的逻辑
                System.out.println("需要领取一些优惠券");

                //调用真正的逻辑执行
                Object object = method.invoke(usbSell,args);

                if (object != null){
                    Float price = (Float) object;
                    price = price + 20;
                    object = price;
                }
                //执行一些后置增强
                System.out.println("购买完毕，赠送一些优惠券");
                return object;
            }
        });

        float price1 = proxy1.sell(1);
        System.out.println("匿名购买以后的价格：" + price1);

    }
}
