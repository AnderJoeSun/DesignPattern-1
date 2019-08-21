package com.myj.designpattern.InterfaceSegreation;

/**
 * Created by maoyujiao on 2019/8/21.
 *
 * 接口隔离原则
 * 客户端不应该依赖它不需要的接口，
 * 即一个类对另一个类的依赖 应该建立在最小的接口上
 *
 * 一个类通过接口依赖另一个类，我们希望这个接口是最小的
 * （按接口隔离原则：用不到的方法可以拆分接口）
 *
 *
 * 1) 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D，如果接口 Interface1对于类A和类C来说不是最小接口，那么类B和类D必须去实现他们不 需要的方法
 2) 将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立 依赖关系。也就是采用接口隔离原则
 */

public class Segreation2 {

    public static void main(String[] args){

        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }

    interface Interface1{
        void operation1();
    }

    interface Interface2{
        void operation2();
        void operation3();
    }

    interface Interface3{
        void operation4();
        void operation5();
    }

    static class B implements Interface1,Interface2{

        @Override
        public void operation1() {
            System.out.println("B 实现了操作1");
        }

        @Override
        public void operation2() {
            System.out.println("B 实现了操作2");
        }

        @Override
        public void operation3() {
            System.out.println("B 实现了操作3");
        }

    }

    static class D implements Interface1,Interface3{

        @Override
        public void operation1() {
            System.out.println("D 实现了操作1");

        }

        @Override
        public void operation4() {
            System.out.println("D 实现了操作4");
        }

        @Override
        public void operation5() {
            System.out.println("D 实现了操作5");
        }
    }

    static class A {
        public void depend1(Interface1 i){
            i.operation1();
        }

        public void depend2(Interface2 i){
            i.operation2();
        }

        public void depend3(Interface2 i){
            i.operation3();
        }
    }

    static class C {
        public void depend1(Interface1 i){
            i.operation1();
        }

        public void depend4(Interface3 i){
            i.operation4();
        }

        public void depend5(Interface3 i){
            i.operation5();
        }

    }

}
