package com.myj.designpattern.DesignPattern.Proxy.staticProxy;

/**
 * Created by maoyujiao on 2019/8/29.
 * 静态代码模式的基本介绍
 静态代理在使用时,需要定义接口或者父类,被代理对象(即目标对象)与代理对象一
 起实现相同的接口或者是继承相同父类

  具体要求
 1) 定义一个接口:ITeacherDao
 2) 目标对象TeacherDAO实现接口ITeacherDAO
 3) 使用静态代理方式,就需要在代理对象TeacherDAOProxy中也实现ITeacherDAO
 4) 调用的时候通过调用代理对象的方法来调用目标对象.
 5) 特别提醒:代理对象与目标对象要实现相同的接口,然后通过调用相同的方法来
 调用目标对象的方法。


 静态代理优缺点
 1) 优点:在不修改目标对象的功能前提下,能通过代理对象对目标功能扩展
 2) 缺点:因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类
 3) 一旦接口增加方法,目标对象与代理对象都要维护
 */

public interface ITeacherDao {
    public void teach();
}
