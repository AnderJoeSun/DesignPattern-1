package com.myj.designpattern.DesignPattern.Proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

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

public class ProxyFactory implements MethodInterceptor{

    private TeacherDao target;

    public ProxyFactory(TeacherDao target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        //创建一个工具类
        //设置父类
        //设置回调函数
        //创建子类对象，即代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TeacherDao.class);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");
        Object obj = method.invoke(target,objects);
        System.out.println("代理结束");
        return obj;
    }
}
