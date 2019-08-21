package com.myj.designpattern.Ocp.improve;

/**
 * Created by maoyujiao on 2019/8/21.
 * 基本介绍
 1) 开闭原则(Open Closed Principle)是编程中最基础、最重要的设计原则
 2) 一个软件实体如类，模块和函数应该对"扩展开放"(对提供方)，对修改关闭(对使用
 方)。用抽象构建框架，用实现扩展细节。
 3) 当软件需要变化时，尽量通过"扩展"软件实体的行为来实现变化，而不是通过修改已
 有的代码来实现变化。
 4) 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。
 */

public class Ocp {
    public static void main(String[] args) {
        GraphEditor editor = new GraphEditor();
        editor.drawShape(new Circle());
        editor.drawShape(new Rectangle());

    }

    /**
     *开闭原则，使用者不需要修改代码
     */
    static class GraphEditor {
        public void drawShape(Shape s) {
            s.draw();
        }

    }

    abstract static class Shape {
        int m_type;
        public abstract void draw();
    }

    static class Circle extends Shape {
        public Circle() {
            super.m_type = 1;
        }

        @Override
        public void draw() {
            System.out.println("绘制圆形");
        }
    }

    static class Rectangle extends Shape {
        public Rectangle() {
            super.m_type = 2;
        }
        @Override
        public void draw() {
            System.out.println("绘制矩形");
        }
    }


}
