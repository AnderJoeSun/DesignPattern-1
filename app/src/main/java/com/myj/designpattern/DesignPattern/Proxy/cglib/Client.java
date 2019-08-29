package com.myj.designpattern.DesignPattern.Proxy.cglib;



/**
 * Created by maoyujiao on 2019/8/29.
 *
 * 1) 静态代理和JDK代理模式都要求目标对象是实现一个接口,但是有时候目标对象只 是一个单独的对象,
 * 并没有实现任何的接口,这个时候可使用目标对象子类来实现 代理-这就是Cglib代理
 2) Cglib代理也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功 能扩展,
 有些书也将Cglib代理归属到动态代理。
 3) Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接 口.
 它广泛的被许多AOP的框架使用,例如Spring AOP，实现方法拦截
 4) 在AOP编程中如何选择代理模式:
 1. 目标对象需要实现接口，用JDK代理
 2. 目标对象不需要实现接口，用Cglib代理
 5) Cglib包的底层是通过使用字节码处理框架ASM来转换字节码并生成新的类

 Cglib代理模式实现步骤
 1) 需要引入cglib的jar文件
 2) 在内存中动态构建子类，注意代理的类不能为final，否则报错 java.lang.IllegalArgumentException:
 3) 目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的 业务方法.


 几种常见的代理模式介绍— 几种变体
 1) 防火墙代理内网通过代理穿透防火墙，实现对公网的访问。
 2) 缓存代理 比如:当请求图片文件等资源时，先到缓存代理取，如果取到资源则ok,如果取不到资源， 再到公网或者数据库取，然后缓存。
 3) 远程代理 远程对象的本地代表，通过它可以把远程对象当本地对象来调用。远程代理通过网络和 真正的远程对象沟通信息。
 4) 同步代理:主要使用在多线程编程中，完成多线程间同步工作
 */

public class Client {
    public static void main(String[] args){
        TeacherDao target = new TeacherDao();
        TeacherDao proxy =(TeacherDao) new ProxyFactory(target).getProxyInstance();
        String returnValue = proxy.teach();
        System.out.println("被代理返回值："+ returnValue);
    }
}
