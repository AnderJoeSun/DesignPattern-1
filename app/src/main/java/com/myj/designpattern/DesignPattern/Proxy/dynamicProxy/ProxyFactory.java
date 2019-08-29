package com.myj.designpattern.DesignPattern.Proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by maoyujiao on 2019/8/29.
 *
 * 动态代理模式的基本介绍
 1) 代理对象,不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
 2) 代理对象的生成，是利用JDK的API，动态的在内存中构建代理对象
 3) 动态代理也叫做:JDK代理、接口代理

 JDK中生成代理对象的API
 1) 代理类所在包:java.lang.reflect.Proxy
 2) JDK实现代理只需要使用newProxyInstance方法,但是该方法需要接收三个参数,完
 整的写法是:
 static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )
 */

public class ProxyFactory {
    private ITeacherDao target;


    public ProxyFactory(ITeacherDao target) {
        this.target = target;
    }

    // getInterfaces()方法和Java的反射机制有关。它能够获得这个对象所实现的所有接口
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理开始了");
                Object obj = method.invoke(target,args); //method即为所调用的目标对象所实现的方法
                System.out.println("代理结束了");
                return obj;
            }
        });

    }
}
