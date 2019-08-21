package com.myj.designpattern.InterfaceSegreation;

/**
 * Created by maoyujiao on 2019/8/21.
 *
 * 接口隔离原则
 * 客户端不应该依赖它不需要的接口，
 * 即一个类对另一个类的依赖 应该建立在最小的接口上
 */

public class Segreation1 {

    public static void main(String[] args){

    }

    interface Interface1{
        void operation1();
        void operation2();
        void operation3();
        void operation4();
        void operation5();
    }

    class B implements Interface1{

        @Override
        public void operation1() {

        }

        @Override
        public void operation2() {

        }

        @Override
        public void operation3() {

        }

        @Override
        public void operation4() {

        }

        @Override
        public void operation5() {

        }
    }

    class D implements Interface1{

        @Override
        public void operation1() {

        }

        @Override
        public void operation2() {

        }

        @Override
        public void operation3() {

        }

        @Override
        public void operation4() {

        }

        @Override
        public void operation5() {

        }
    }

    class A {
        public void depend1(Interface1 i){
            i.operation1();
        }

        public void depend2(Interface1 i){
            i.operation2();
        }

        public void depend3(Interface1 i){
            i.operation3();
        }
    }

    class C {

        public void depend1(Interface1 i){
            i.operation1();
        }

        public void depend4(Interface1 i){
            i.operation4();
        }

        public void depend5(Interface1 i){
            i.operation5();
        }

    }

}
